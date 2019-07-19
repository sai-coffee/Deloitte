package Inheritance;
//equals
public class Equal {

int Roll;
String name;

public Equal(int i, String name1)
{
	this.Roll=i;
	this.name=name1;

}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Roll;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Equal other = (Equal) obj;
	if (Roll != other.Roll)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



public static void main(String[] args)
{
	
	Equal e1=new Equal(100,"ab");
	Equal e2=new Equal(100,"ab");
	Equal e3= e1;
	
	//true-but it is coming false
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1==e2);
	System.out.println(e1==e3);
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	
	
	
}

	
}
