/*Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke 
(i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number
of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.
*/

package logicalprograms;
import java.util.*;
public class Test01
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int max=sc.nextInt();
		int min=sc.nextInt();
		int plays=sc.nextInt();
		int win=0,loss=0;
		int bet=0,cash=max;
		for(int i=0;i<plays;i++)
		{
			while(cash>min && cash>0)
			{
				bet++;
				if(Math.random()>0.5)
					{win++; cash++;}
				else
					{loss++; cash--;
					}
			}
			
		}
		System.out.println("total bet " +bet +" \ntotal win " +win +" \nloss is " +loss);
	}

}
