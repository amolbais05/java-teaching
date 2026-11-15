package oops.animals;


abstract class Animal {

	private String name;

	public Animal(String name)
	{
		this.name=name;
	}

	public Animal()
	{

	}

	public void eat(int quantity, String food)
	{

		System.out.println("Animal is eating "+ food +" of "+ quantity);
	}

	public void walk()
	{

		System.out.println("Now i am Walking");
	}

	public void run()
	{

		System.out.println("Now i am Running");
	}

	public void sleep()
	{
		System.out.println("Zzzz");
	}

	abstract public void sound();

}
