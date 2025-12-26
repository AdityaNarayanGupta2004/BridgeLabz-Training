interface Worker { // interface
    void performDuties();
}
class Person { // base class
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker { // subclass 
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " Chef is Cooking food");
    }
}
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " Waiter is serving Customers");
    }
}
// main function
public class RestaurantManagementHybridInheritance{
    public static void main(String[] args) {
        Chef c = new Chef("Mohan", 1);
        c.performDuties();
        Waiter w = new Waiter("Sohan", 2);
        w.performDuties();
    }
}