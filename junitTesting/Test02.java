/*To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week
that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year).
For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for 
Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7*/
package junitTesting;
import java.util.*;
public class Test02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		Dayoftheweek(date,month,year);

	}
	
	public static void Dayoftheweek(int d,int m,int y)
	{
		y=y-(14-m)/12;
		int x=0;
		x = y+ y/4-y/100 + y/400;
		m=m+12*((14-m)/12)-2;
		d= (d+x+31*m/12)%7;
		String []days={"sunday","monday","tuesday","Wednesday","thursday","friday","friday","saturday"};
		for(int i=0;i<days.length;i++)
		{
			if(d==i)
			{
				System.out.println(days[i]);
			}
		}
	}

}
