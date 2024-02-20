package Basic;
import java.util.*;
public class Test03 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int year=sc.nextInt();
		boolean out=false;
		if(year>1000)
		{
			if(year/4==0)
			{
				if(year/100!=0)
				{
					if(year/400==0)
					{
						out=true;
					}
					else
						out=false;
				}
				else
					out= false;
			}
		}
		if(out==true)
		System.out.println("Is A leap year");
		else
			System.out.println("Is A leap year");	
	}

}
