import java.util.Scanner;

public class TierEx 
{
	int amount;
	int count,count1;
	public void t1()
	{
		amount=amount+count*1;
	}
	public void t2()
	{
		count1=count-500;
		count=500;
		amount=amount+count1*2;
		t1();
		
	}
	public void t3()
	{
		
	}
	public static void main(String[] args) {
		TierEx t = new TierEx();
		Scanner sc =new Scanner(System.in);
		int c = 0;
		t.count=sc.nextInt();
		if(t.count>1000)
		{
			c=1;
			t.count1=t.count-1000;
			t.count=1000;
			t.amount=t.count1*3;
			t.t2();
		}
		
		else
		{
			if(t.count>=0 && t.count<=500)
			{
				t.t1();
			}
			if(t.count>500 && t.count<=1000)
			{
				t.t2();
			}
		}
		System.out.println(t.amount);
	}
}
