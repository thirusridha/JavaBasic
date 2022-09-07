import java.util.Scanner;
class B
{
	 static int a=10;
	 public void b()
	{
		System.out.println("parent");
	}
}
 class C extends B
{
	 int a=20;
	static void m1() {
		B.a=30;
	System.out.println(B.a);
	}
}
public class   SortingEx1 {
	public static void main(String[] args)
	{
		C c= new C();
		c.m1();
		
	}

	
}
