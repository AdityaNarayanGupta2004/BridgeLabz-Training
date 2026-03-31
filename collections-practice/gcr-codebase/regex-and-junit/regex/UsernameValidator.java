public class UsernameValidator {
    public static void main(String[] args) {
        String[] usernames = {"user_123","123user","us","User_Name1","user@123"};
        // Regex pattern
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        for(String name : usernames){
            if(name.matches(regex)){
                System.out.println(name + "->Valid");
            }else{
                System.out.println(name + "->Invalid");
            }
        }
    }
}
