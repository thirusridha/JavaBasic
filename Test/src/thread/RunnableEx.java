package thread;
class Runnable1 implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
}
public class RunnableEx 
{
	public static void main(String[] args) 
	{
		
		Runnable1 r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
	}
}
