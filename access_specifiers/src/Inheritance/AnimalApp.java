package Inheritance;

public class AnimalApp 
{	
	
	public static void main(String[] args)
	{
		Cat c  = new Cat();
		c.eat();
	}
}

class Animal
{
	public void eat()
	{
		System.out.println("It eats a lot");
		
	}
	public void friend()
	
	{
		System.out.println("It's friemdly");
	}
	public void size()
	{
		System.out.println("it's large");
		
	}
}

class Cat extends Animal
{

	public void eat()
	
	{
		System.out.println("It eats less");
		super.eat();
		
	}
	
	
	
	
}