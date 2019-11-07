/*Write a static function sqrt  to compute the square root of a nonnegative number c given in the input
  using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;
 */

package junitTesting;
import java.util.*;
public class Test05 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sqrt(n);
	}
	
	public static void sqrt(int c)
	{
		double epsilon=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.print(t);
	}
}
