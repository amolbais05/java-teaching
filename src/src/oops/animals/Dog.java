package oops.animals;

public class Dog extends Animal{

	String name;
	int age;


	// Default
	public Dog()
	{

	}

	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Dog(String name)
	{
		this.name = name;
	}

	@Override
	public void sound()
	{
		System.out.println(name +" Boo Boo!");
	}	
	

}
