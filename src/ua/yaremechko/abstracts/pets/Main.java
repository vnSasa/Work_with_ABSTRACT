package ua.yaremechko.abstracts.pets;

public class Main {
	public static void main(String[] args) {
		
		Cow cow = new Cow();
		cow.voice();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.voice();
		
		System.out.println();
		
		Dog dog = new Dog();
		dog.voice();
		
	}

}
