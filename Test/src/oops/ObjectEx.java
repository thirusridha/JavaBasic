package oops;
class Student
{
	int a;
	String str;
	public Student(int a,String str)
	{
		this.a=a;
		this.str=str;
	}
	public void show()
	{
		System.out.println(a+" "+str);
	}
}
public class ObjectEx 
{
	public static void main(String[] args)
	{
		Student s= new Student(1,"sridhar");
		s.show();
	}
	
			
}
