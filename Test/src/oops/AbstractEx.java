package oops;
abstract class Abc
{
	//public abstract void  m();
	static int a=10;
	public void m()
	{
		System.out.println("hi");
	}
	abstract public void m1();
	
	
}

public class AbstractEx extends Abc
{
 
	public void m1() {
		System.out.println("bye..");
	}
	public static void main(String[] args) {
		AbstractEx c = new AbstractEx();
		c.m1();
	}
}