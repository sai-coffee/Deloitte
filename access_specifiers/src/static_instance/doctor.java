package static_instance;
 class d1
{
	
	static int i=0;
	
	public d1()
	{
		++i;
	}
}
public class doctor
	{
		public static void main(String[] args)
		{
			d1 q1 = new d1();
			d1 q2 = new d1();
			System.out.println(q1.i);
			
		}
	

}
