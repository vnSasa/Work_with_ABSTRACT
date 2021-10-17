package ua.yaremechko.abstracts.amphibia;

public class Frog extends Amphibia {

	@Override
	void eat() {
		System.out.println("Time to eat");
	}

	@Override
	void sleep() {
		System.out.println("Time to sleep");
	}

	@Override
	void swim() {
		System.out.println("Time to swim");
	}

	@Override
	void walk() {
		System.out.println("Time to walk");
	}

}
