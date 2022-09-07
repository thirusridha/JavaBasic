package oops;

interface InterfaceEx {
	abstract public void method();
}
public class Abcd implements InterfaceEx
{
	public void method() {
		
		System.out.println("hii");
	}
	public static void main(String[] args) {
		Abcd v =new Abcd();
		v.method();
	}
	
}