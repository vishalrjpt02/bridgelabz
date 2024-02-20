package logicalprograms;
import java.util.*;
public class Test03 {

	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.print("to start enter 1\n");
		  int s=sc.nextInt();
		  double start=0.0;
		  double stop=0.0;
		  if(s==1)
		  {
		  start=System.currentTimeMillis();
		  System.out.print("enter 0 to stop\n");
		  int end=sc.nextInt();
		  if(end==0)
		  {
			  stop=System.currentTimeMillis();
			  System.out.println("elipse time="+(stop-start)+" Millisecond");
		  }
		  } 
	}
}
