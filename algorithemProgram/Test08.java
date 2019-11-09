package algorithemProgram;
import java.util.*;
public class Test08 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=0;
		search(num,n);

	}
	
	public static void search(int num,int n)
	{
		if(num>n)
		{if(num==Math.pow(2,n))
		{
			System.out.println(n);
		}
			search(num,n+1);
		}
		
	}

}
