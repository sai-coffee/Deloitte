package constructor_chaining;

public class Const {

	int studentRollno;
	String studentName;
	int marks;
	int fees;
	
	public Const()
	{
		studentRollno=0;
		studentName="NA";
		marks=0;
		fees=0;
		
	}
		
	

	public Const(int studentRollno, String studentName) 
	{	this();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
	}

	public Const(int studentRollno, String studentName, int marks)
	{
		this();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

	public Const(int studentRollno)
	
	{
		this();
		this.studentRollno = studentRollno;
	}
	
	public static void main(String[] args)
	{
		Const c =new Const(100,"sai");
		System.out.println(c.marks);
	}
	
	
}

