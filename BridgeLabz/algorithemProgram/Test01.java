package algorithemProgram;
import java.util.*;
public class Test01 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1 = sc.next();
		char s[]=s1.toCharArray();
		permute(s);
	}
	public static void permute(char[] in)
	{
		int sum=0;
		int out=1;
		for(int i=0;i<in.length;i++)
		{
			int n=in.length;
			int r=i;
			int temp=n-r;
			int fact1=1;
			int fact2=1;
			while(n>0)
			{
				
				fact1=fact1*n;
				n--;
			}
			
			while(temp>0)
			{
				fact2=fact2*temp;
				temp--;
			}
			out=fact1/fact2;
			sum=sum+out;	
		}
		System.out.println(out);
	}

}
