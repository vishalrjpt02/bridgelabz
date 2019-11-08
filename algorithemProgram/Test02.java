package algorithemProgram;
import java.util.*;
public class Test02
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int l=0,h=arr.length;
		binarySearch(arr,key,l,h);
	}
	
	public static void binarySearch(int ar[],int k,int low,int high)
	{
		if(high>=low)
		{
		int mid=low+(high-low)/2;
		
		if(k==ar[mid])
		{
			System.out.println("Element found Index is " +mid);
		}
		else if(ar[mid]<k)
		{
			low=mid+1;
			binarySearch(ar,k,low,high);
		}
		else if(k<ar[mid])
		{
			high=mid-1;
			binarySearch(ar,k,low,high);        
		}
		}
	}

}
