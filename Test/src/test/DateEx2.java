package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	static int i=9;
	public static void  b()
	{
		System.out.println("bye");
		a();
	}
	public static Date a()
	{
		Date date = new Date();
		
		if(i<11)
		{
			i++;
			System.out.println("hii");
			b();
		}
		return date;
	}
	public static void main(String[] args) throws ParseException {
		String dateTime=new SimpleDateFormat("dd-MM-yy").format(new Date()).toString();
		Date date = new SimpleDateFormat("dd-MM-yy").parse(dateTime);
		Date date2 = new SimpleDateFormat("dd-MM-yy").parse(null);
//		System.out.println(date);
//		System.out.println(date2);
//		if(date.compareTo(date2)>=0)
//		{
//			System.out.println("hi");
//		}
//	a();
				System.out.println(date2);
	}
}

