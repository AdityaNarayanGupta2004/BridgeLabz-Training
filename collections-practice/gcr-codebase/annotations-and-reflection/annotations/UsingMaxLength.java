package annotationandreflection;


import java.lang.annotation.*;
import java.lang.reflect.Field;

public class UsingMaxLength {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface MaxLength {
        int value();
    }

    static class User {

        @MaxLength(8)
        private String username;

        public User(String username) {
            checkLength(username);
            this.username = username;
        }

        private void checkLength(String value) {
            try {
                Field field = User.class.getDeclaredField("username");
                MaxLength max = field.getAnnotation(MaxLength.class);

                if (value.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length must be ≤ " + max.value()
                    );
                }

            } catch (NoSuchFieldException e) {
                // Reflection error (won't happen here, but required)
                throw new RuntimeException("Field not found", e);
            }
        }
    }

    public static void main(String[] args) {

        try {
            new User("john");        // ✅ valid
            new User("john_doe123"); // ❌ invalid
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

