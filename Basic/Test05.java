package Basic;
/*
 Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.

*/
import java.util.*;
public class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
	  if(num>0)
	  {
		double sum=0;
		for(double i=1;i<=num;i++)
		{
			sum=sum+1/i;
		}
		System.out.println(sum);
	   }
	  
	}
}
