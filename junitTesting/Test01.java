/*Find the Fewest Notes to be returned for Vending Machine
Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending
Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be
returned by the Vending Machine as a Change
I/P -> read the Change in Rs to be returned by the Vending Machine
Logic -> Use Recursion and check for largest value of the Note to return change to get to
minimum number of Notes. 
O/P -> Two Outputs - one the number of minimum Note needed to give the change and second 
list of Rs Notes that would given in the Change
*/
package junitTesting;
import java.util.*;
public class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amout to be calculated");
		int n= sc.nextInt();
		printer(n);
	}
	
	public static void printer(int num)
	{
		int notes[]={1000,500,100,50,10,5,2,1};
		int notecount[]=new int[8];
		
		for(int i=0;i<notes.length;i++)
		{
			if(num>=notes[i])
			{
				notecount[i]=num/notes[i];
				num=num-notecount[i]*notes[i];
			}
		}
		 System.out.println("Currency Count ->"); 
	        for (int i = 0; i<8; i++)
	        { 
	            if (notecount[i] != 0)
	            { 
	                System.out.println(notes[i] + " : " + notecount[i]); 
	            }     
	        }
	}
}
