/*
Write a Util Static Function to calculate monthlyPayment that reads in three command-line arguments P, Y, and
R and calculates the monthly payments you would have to make over Y years to pay off a P principal loan amount 
at R per cent interest compounded monthly. The formula is The formula is
*/

package junitTesting;
import java.util.*;
public class Test04 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		int y=sc.nextInt();
		double r=sc.nextDouble();
		Payment(p,y,r);
	}
	
	public static void Payment(double p,int y,double r)
	{
		double pay=0.0;
		int n=12*y;
		double R=r/(12*100); 
		pay = p*R/(1-Math.pow(1+R,-n));
		System.out.println("monthely payment is " +pay);
	}

}
