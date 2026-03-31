package annotationandreflection;

class Animal{
	void makeSound() {
		System.out.println("Animal");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog Barks");
	}
}
public class UsingOveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.makeSound();

	}

}
