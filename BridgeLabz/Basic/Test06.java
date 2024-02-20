package Basic;
/*Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.
*/
import java.util.*;
public class Test06 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i*i<=num;i++)
		{
			if(num%i==0)
			{
				if(i%2!=0)
				{
					System.out.print(i+ " ");
				}
			}
		}
	}

}
