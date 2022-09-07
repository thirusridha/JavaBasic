public class PatternEx 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			int num=i;
			for(int j=5;j>i;j--)
			{
				System.out.print(num+" ");
				num=num-j+5;
			}
			System.out.println();
		}
	}
}
