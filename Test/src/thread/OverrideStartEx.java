package thread;
class Override extends Thread
{
	public void start1()
	{
		super.start();
		System.out.println("start method...");
		System.out.println(Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("run method...");
		System.out.println(Thread.currentThread().getName());
		
	}
}
public class OverrideStartEx 
{
	public static void main(String[] args) {
		Override o = new Override();
		o.start1();
		System.out.println("hlo");
	}
}
