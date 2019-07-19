package static_instance;

public class pro1 
{
	
	static int i=0;
	
	public pro1()
	{
		++i;
	}
}
 class D2
 {
		public static void main(String[] args)
		{
			pro1 q1 = new pro1();
			pro1 q2 = new pro1();
			System.out.println(q1.i);
			
		}
	

}
