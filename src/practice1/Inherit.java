package practice1;

class Animal{
	void makeSound() {
		System.out.println("Animals makes sound");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog is barking");
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog animal=new Dog();
		animal.makeSound();

	}

}
