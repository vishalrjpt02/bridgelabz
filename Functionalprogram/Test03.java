package Functionalprogram;
/*Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean
 distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y).
 Use Math.power function
 */
import java.util.*;
public class Test03 
{
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		double out=0;
		out=Math.sqrt(((x*x) + (y*y)));
		System.out.println(out);

	}

}
