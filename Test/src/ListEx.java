import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		List<String> l = new ArrayList<String>();
//		l.add("sridhar");
		String str ;
		
		for(int i=0;i<10;i++) 
		{
			str=sc.next();
			l.add(str);
		}
		System.out.println(l);
	}
}
