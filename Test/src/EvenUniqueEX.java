public class EvenUniqueEX 
{
	public static void main(String[] args) 
	{
		int a[]= {1,0,4,3,4,4,4,4,4};
		int a1[]=new int[a.length];
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			int p=0;
			for(int j=0;j<a.length;j++)
			{
				
				if(p==0  && a[i]==a1[j] && num<a.length)
				{
				   p=1;
				}
				
			}
			if(p==0)
			{
				a1[num]=a[i];
				num++;
			}
		}
		for(int i=0;i<a1.length;i++)
		{
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
}
