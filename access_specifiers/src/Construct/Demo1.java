package Construct;
 class Demo2 
 {
	 int i=10;
public Demo2()
{

System.out.println("A is 1st called");
}
public Demo2 (int y)
{
	i+=10;
	System.out.println("A is updated");
}
public String toString()

{
	System.out.println("hello");
	return null;
}
}
 
public class Demo1
{
	public 
	static void main(String[] args)
	{
		Demo2 D = new Demo2();
		Demo2 E = new Demo2(100);
		System.out.println(D.i);
		System.out.println(E.i);
		System.out.println(D);
		
		
	}
}


