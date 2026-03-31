import java.util.*;
abstract class WarehouseItem{
    String name;
    int price;
    // making constructor
    WarehouseItem(String name, int price){
        this.name = name;
        this.price = price;
    }
    abstract void displayAll();
}

class Electronics extends WarehouseItem{

    Electronics(String name, int price) {
        super(name, price);
    }

    @Override
    void displayAll() {
        System.out.println("Electronics items name is:-> "+ name +" and price is"+price);
    }
    
}

class Groceries extends WarehouseItem{

    Groceries(String name, int price){
        super(name, price);
    }
    @Override
    void displayAll(){
        System.out.println("Groceries item name is:-> "+name+" and price is "+price);
    }
    
}

class Furniture extends WarehouseItem{

    Furniture(String name, int price) {
        super(name, price);
    }
    @Override
    void displayAll(){
        System.out.println("Furniture item name is:-> "+ name + " and price is "+price);
    }
}

class Storage<T extends WarehouseItem>{
    List<T> items = new ArrayList<>();

    void addItems(T item){
        items.add(item);
    }

    T getItems(int index){
        return items.get(index);
    }
    List<T> getAllItem(){
        return items;
    }
}

class Warehouse{
    static void displayAllItems(List<? extends WarehouseItem> list){
        for(WarehouseItem item: list){
            item.displayAll();
        }
    }
}

public class WareHouseManagementSystem {
    public static void main(String[] args) {
        
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItems(new Electronics("Mobile", 20000));
        electronicStorage.addItems(new Electronics("Laptop", 80000));
        
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItems(new Furniture("Table", 5000));
        furnitureStorage.addItems(new Furniture("sofa", 20000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItems(new Groceries("Rice", 1000));
        groceriesStorage.addItems(new Groceries("oil", 2000));

        System.out.println("Groceries Items are:*-*-*-*-*-*");
        Warehouse.displayAllItems(groceriesStorage.getAllItem());
        
        System.out.println("Electronics Items are:*-*-*-*-*-*");
        Warehouse.displayAllItems(electronicStorage.getAllItem());

        System.out.println("Furniture Items are:*-*-*-*-*-*");
        Warehouse.displayAllItems(furnitureStorage.getAllItem());
    }
}
