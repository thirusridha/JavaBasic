package oops;

	interface A
	{  
		void msg();
	}
	interface B
	{  
		void msg();
	}  
	class D{
		public void demo()
		{
			int b=30;
		}
	}
	public class IniheritanceEx extends D
	{
		public void demo1()
		{
			int b=30;
		}
		
		public static void main(String[] args) 
		{
			D i =new IniheritanceEx();
			i.demo();
		}
		
	}
	
		