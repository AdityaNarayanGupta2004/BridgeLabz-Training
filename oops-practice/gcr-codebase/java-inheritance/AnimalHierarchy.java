class Animal{
    String name;
    int age;
    Animal(String name, int age){ // parent class  
        this.name = name;
        this.age = age;
    }
    void makesound(){
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal{ // here its a child of animal 
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makesound(){
        System.out.println("make a sound like Bark");
    }
}

class Cat extends Animal{ // subclass of animal 
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makesound(){
        System.out.println("make a sound like meow");
    }
}
class Bird extends Animal{ // subclass of animal
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makesound(){
        System.out.println("make a sound like Chirp");
    }
}

public class AnimalHierarchy { 
    public static void main(String[] args){
        Animal animal = new Animal("Animal",9);
        animal.makesound();
        System.out.println("Dog");
        Animal dog = new Dog("Bull",15);
        dog.makesound();
        System.out.println("Cat");
        Cat cat = new Cat("Tom",5);
        cat.makesound();
        System.out.println("Bird");
        Bird bird = new Bird("Parrot",2);
        bird.makesound();
    }
}