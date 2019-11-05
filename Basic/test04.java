package Basic;
public class test04 
{
	public static void main(String[] args) 
	{
		double out=0;
		int num=Integer.parseInt(args[1]);
		for(int i=0;i<=num;i++)
		{
			out=Math.pow(2,i);
		}
		System.out.println(out);

	}

}
