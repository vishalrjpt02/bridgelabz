/*Merge Sort  - Write a program to do Merge Sort of list of Strings. 
Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves independently, and then merge
 the results to sort the full array. To sort a[lo, hi), we use the following recursive strategy:
Base case: If the subarray length is 0 or 1, it is already sorted.
Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the two subarrays a[lo, mid) 
and a[mid, hi), and merge them to produce a sorted result.
*/
package algorithemProgram;
import java.util.Scanner;
public class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		Test05 ob=new Test05();
		ob.sort(arr,0,arr.length-1);
		print(arr);
	}
	
	public static void mergsort(int ar[],int left,int mid,int right)
	{
		int n1=mid-left+1,n2=right-mid;
		int l[]=new int[n1];
		int r[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			l[i]=ar[n1];	
		}
		for(int j=0;j<n2;j++)
		{
			r[j]=ar[mid+1+j];
		}
		
		int i=0,j=0;
		
		int k=left;
		
		while(i<n1 && j<n2)
		{
			if (l[i] <= r[j]) 
            { 
                ar[k]=l[i]; 
                i++; 
            } 
            else
            { 
                ar[k] = r[j]; 
                j++; 
            } 
            k++; 
		}
		while(i<n1)
		{
			ar[k] = l[i]; 
            i++; 
            k++;
		}
		while(i<n2)
		{
			ar[k]=r[j];
			j++;
			k++;
		}
		
		
	}
	void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2;  
            sort(arr, l, m); 
            sort(arr , m+1, r); 
   
            mergsort(arr, l, m, r); 
            
        } 
    }
	static void print(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
	}

}
