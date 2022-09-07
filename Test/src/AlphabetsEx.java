public class AlphabetsEx 
{
	public static void main(String[] args)
	{
		String str="$$$";
		char ch1[]=str.toCharArray();
	//	boolean b=true;
		int num1=0;
		int l=0;
		for(int i=0;i<ch1.length;i++)
		{
			
			
			if((ch1[i]<65 || ch1[i]>90)&&(ch1[i]<97 || ch1[i]>122))
			{
				System.out.print(ch1[i]);
				l++;
			}
			int num=26;
			boolean b=true;
			for(char ch='a';ch<='z';ch++)
			{
				if(ch==ch1[i])
				{
					System.out.print(num);
					b=false;
					l++;
				}
				num--;
			}
			if(b)
			{
				 num=26;
				for(char ch='A';ch<='Z';ch++)
				{
						if(ch==ch1[i])
						{
							System.out.print(num);
							l++;
						}
						num--;
				}
				
			}
		}
		if(ch1.length==l)
		{
			System.out.println("Number String");
		}
		
	}
}
