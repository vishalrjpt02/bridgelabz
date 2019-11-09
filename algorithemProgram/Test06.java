/*An Anagram Detection Example
Desc -> One string is an anagram of another if the second is simply a rearrangement of the first.
 For example, 'heart' and 'earth' are anagrams...
I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
O/P -> The Two Strings are Anagram or not....
*/

package algorithemProgram;
import java.util.Scanner;
public class Test06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char ar1[]=s1.toCharArray();
		char ar2[]=s2.toCharArray();
		String estring="";
		boolean chk=false;
		for(int i=ar2.length-1;i>=0;i--)
		{
			estring=estring+ar2[i];
		}
		ar2=estring.toCharArray();
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]==ar2[i])
			{
				chk=true;
			}
			else
				chk=false;
		}
		System.out.println(chk);
	}

}
