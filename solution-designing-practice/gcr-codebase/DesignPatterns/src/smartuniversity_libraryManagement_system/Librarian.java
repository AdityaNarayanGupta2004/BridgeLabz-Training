package smartuniversity_libraryManagement_system;

public class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Librarian " + name + " notified: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
