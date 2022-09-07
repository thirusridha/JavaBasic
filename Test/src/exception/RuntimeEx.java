package exception;

public class RuntimeEx 
{
	
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			for(int i=5;i>-3;i--)
			{
				int b=a/i;
				System.out.println(b);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}