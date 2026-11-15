package oops.animals;

public class MainClass {
	
	public static void main(String[] args) {


		Animal animal;

		animal = new Dog("Tommy", 3);
		animal = new Dog("Moti");
		animal.sound();

		animal = new Cat();
		animal.sound();

		animal = new Elephant();
		animal.sound();

		Animal myhorse = new Horse();
		myhorse.sound();


		/*Dog tommy = new Dog();
		tommy.eat();
		tommy.eat("Biscuit");
		tommy.eat(2, "Pedigree");
		tommy.run();
		tommy.sleep();
		tommy.sound();		
		tommy.walk();*/
		
		System.out.println("--------------");

		/*
		Cat cat = new Cat();
		cat.eat();
		cat.eat("Fish");
		cat.run();
		cat.sleep();
		cat.sound();
		cat.walk();		
		
		System.out.println("--------------");
		
		Elephant elephant = new Elephant();
		elephant.eat();
		elephant.eat("Laddu");
		elephant.run();
		elephant.sleep();
		elephant.sound();
		elephant.walk();
		
		System.out.println("--------------");
		
		Horse horse = new Horse();
		horse.eat();
		horse.eat("Grass");
		horse.run();
		horse.sleep();
		horse.sound();
		horse.walk();*/
	}

}
