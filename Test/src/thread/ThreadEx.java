package thread;
class A extends Thread{
	public void run() {
		
		 for(int i=0;i<=5;i++)
		 {
//			 Thread.yield();
			 try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(i);
		 }
	}
}
class B extends Thread{
	public void run() {
		 for(int i=10;i<=15;i++)
		 {
			 Thread.yield();
			 System.out.println(i);
		 }

	}
}
public class ThreadEx
{
	public static void main(String[] args) throws InterruptedException 
	{
		A a = new A();
		B b = new B();
		a.start();
//		a.join();
		b.start();
//		a.setPriority(1);
//		b.setPriority(10);
		
	}
}
