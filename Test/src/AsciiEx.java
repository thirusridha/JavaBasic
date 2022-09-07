import java.util.Scanner;

public class AsciiEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch=str.toCharArray();
		char[] ch3=new char[ch.length];
		char[] ch4=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int value=ch[i]+3;
			char chh =(char) value;
			ch3[i]=chh;
			System.out.print(chh);
		}
		System.out.println();
		int num=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			ch4[num]=ch3[i];
			System.out.print(ch3[i]);
			num++;
		}
		System.out.println();
		int l=ch.length/2;
		for(int i=0;i<ch.length;i++)
		{
			
			if(i<l)
				System.out.print(ch4[i]);
			if(i>=l)
			{
				int value=ch4[i]-1;
				char chh =(char) value;
				ch4[i]=chh;
				System.out.print(ch4[i]);
			}
				
		}
		
		
	}
}
