package DateAndTime;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateClass {

	public static void main(String[] args) throws ParseException {
		
		/*Date date=new Date();
		//current date
		System.out.println("Current Date and time :"+date);
		Date d1=new Date(System.currentTimeMillis());
		SimpleDateFormat pdf=new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(pdf.format(new Date()));
		
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE MMMM yyyy HH:mm:ss");
		System.out.println("Regional Time :"+sdf.format(new Date()));
		*/
		String s="2018-11-28";
		Date d=Date.valueOf(s);
		System.out.println(d);
		
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);
		
		
		/*
		Date d1=new Date(20,1,23);
		Date d2=new Date(20,12,9);
		
		System.out.println("Date1:"+d1);
		System.out.println("Date2:"+d2);
		*/
	}

}
