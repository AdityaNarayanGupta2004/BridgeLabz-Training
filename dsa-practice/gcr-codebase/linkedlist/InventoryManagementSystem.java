import java.util.*;
class Node{
    String name;
    int id;
    int quantity;
    int price;
    Node next;
    Node(String name, int id, int quantity, int price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = next;
    }
}

class InventoryManagementSystem {
    private Node head = null;
    public void addAtBeginning(String name, int id, int quantity, int price){
        Node newNode = new Node(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Added at beginning");
    }
    public void addAtend(String name, int id, int quantity, int price){
        Node newNode = new Node(name, id, quantity, price);
        if(head == null) {
            head = newNode;
            System.out.println("Added at end");
        }else{
            Node last = head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            System.out.println("Added at end");
        }
    }
    public void addAtPosition(String name, int id, int quantity, int price, int position){
        Node newNode = new Node(name, id, quantity, price);
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            System.out.println("Added at position");
        }
        else if(position == 1){
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
            System.out.println("Added at position");
        }
    }
    public void removeByID(int idd){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.id == idd){
            head = head.next;
            System.out.println("Deleted");
            return;
        }
        Node curr = head;
        while(curr.next != null && curr .next.id != idd){
            curr = curr.next;
        }
        if(curr.next == null){
            System.out.println("ID not found");
        }else{
            curr.next = curr.next.next;
            System.out.println("Deleted");
        }
    }
    public void searchByID(int idd){
        Node temp = head;
        while(temp != null){
            if(temp.id == idd){
                System.out.println("ID found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Id Not Found");
    }
    public void updateQuantity(int id, int quantity){
        Node temp = head;
        while(temp != null){
            if(temp.id == id){
                temp.quantity = quantity;
                System.out.println("Updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Id is not found");
    }

    public void calculate_Display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        int sum = 0;
        while(temp != null){
            int t = temp.id*temp.quantity;
            sum += t;
            temp = temp.next;
        }
        System.out.println("total: "+ sum);
    }
// public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManagementSystem list = new InventoryManagementSystem();
        list.addAtBeginning("John", 1, 100 , 10);
        list.addAtend("mohan", 2, 200, 20);
        list.addAtPosition("ram", 3, 300, 30, 2);
        list.updateQuantity(2, 500);
    }
}

