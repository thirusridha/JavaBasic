public class TstEx extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			
			System.out.println(i);
		//	try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);} 
			
			
		}
	System.out.println("---------");
	try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
	for(int i=0;i<5;i++) {
			
			System.out.println(i);
		//	try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);} 
			
			
		}
	}
	public static void main(String[] args) {
		
		TstEx t1=new TstEx();
		t1.start();
	}
}
