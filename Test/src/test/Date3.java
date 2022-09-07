package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date3
{
	public void m1()
	{
		System.out.println("method called....");
	}
	public static void main(String[] args) throws ParseException 
	{
		Date3 m=new Date3();
		Calendar c =Calendar.getInstance();
		System.out.println(c);
		m.m1();
		
//		c.setTime(d);
//		c.add(Calendar.MONTH,6);
//		SimpleDateFormat s =new SimpleDateFormat("dd-MM-yyyy");
//		String s1=s.format(d);
//		System.out.println(s1);
		String s="2022-08-04";
//		Date d =new SimpleDateFormat("dd-MM-yyy").parse(s);
		Date d1 =new SimpleDateFormat("yyyy-MM-dd").parse(s);
		SimpleDateFormat s1 =new SimpleDateFormat("yyyyMMdd");
		Date n=new Date("2022-08-04");
		System.out.println(n);
//		c.setTime(d);
//		c.add(Calendar.MONTH,6);
//		String l =s1.format(c.getTime());
		System.out.println(d1);
		System.out.println(s1.format(d1));
	//	System.out.println(c.getTime());
		//Date d5 =new SimpleDateFormat("dd-MM-yyyy").parse(c.getTime().toString());
	//	System.out.println(d5);
		
	}
}
