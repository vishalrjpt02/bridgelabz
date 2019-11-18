package leftprogram;

import java.util.Scanner;

public class TicTacToe 
{
	char tictac[][] =new char[3][3];
	
	// 1. Display unit
	public static void Display(char tictoc[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(tictoc[i][j] +"   ");
			}
			System.out.println();
		}
	}
	
	
	// 2.Replace unit
	static void Replace(char arr[][] , char find,char replace)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]==find)
				{
					arr[i][j]=replace;
					return;
				}
			}
		}
	}
	
	
	// 3. check for win function
	
	//3.1 
	
	public boolean checkforwin()
	{
		return(checkforRow()||checkforCollumn()||checkforDigonal());
	}
	
	
	//3.2 Function to check row collumn and digonal
	public boolean check(char c1,char c2,char c3)
	{
		return(c1==c2 && c2==c3);
	}
	
	//3.3 check for row function
	public boolean checkforRow()
	{
		for(int i=0;i<3;i++)
		{
			if(check(tictac[i][0],tictac[i][1],tictac[i][2])==true)
			{
				return true;
			}
			
		}return false;
	}
	
	//3.4 check for collum function
	
	public boolean checkforCollumn()
	{
		for(int i=0;i<3;i++)
		{
			if(check(tictac[0][i],tictac[1][i],tictac[2][i]))
			{
				return true;
			}
		}
		return false;
	}
	
	//3.5 check for Digonal
	public boolean checkforDigonal()
	{
		return ((check(tictac[0][0],tictac[1][1],tictac[2][2])==true) ||(check(tictac[0][2],tictac[1][1],tictac[2][0])==true));
	}
	
	
	

	public static void main(String[] args) 
	{
		TicTacToe game=new TicTacToe();
		Scanner sc=new Scanner(System.in);

	//Select players
		
		String user1,user2;
		char mark1,mark2;
		System.out.println("enter player1 name");
		user1=sc.nextLine();
		System.out.println("enter player2 name");
		user2=sc.nextLine();
		
	//Markselection	
		System.out.println("enter mark forplayer 1");
		mark1=(sc.next().charAt(0));
		if(mark1=='X'||mark1=='x')
		{
			mark2='O';
		}
		else
			mark2='X';
		
	//installing on bord
		int counter=0;
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				game.tictac[i][j]=Character.forDigit(++counter,10);
			}
		}
		
		
	//Display Board
		Display(game.tictac);
		
	//play...
		char input;
		for(int i=0;i<4;i++)
		{
			System.out.print(user1+" Turn :");
			input=sc.next().charAt(0);
			Replace(game.tictac,input,mark1);
			Display(game.tictac);
			System.out.print(user2+" Turn :");
			input=sc.next().charAt(0);
			Replace(game.tictac,input,mark2);
			Display(game.tictac);
		}
		System.out.print(user1 +": ");
		input=sc.next().charAt(0);
		Replace(game.tictac,input,mark1);
		Display(game.tictac);
		
		if(game.checkforwin())
		{
			System.out.print("we have a winner");
		}
		else
			System.out.print("match is draw");
		
		sc.close();
	}
	
	public static int computer()
	{
		int num=0;
		while(num>0 && num<10)
		{
			num=(int)Math.random();
		}
		if(isTaken(num)==true)
		{
			computer();
		}
		else
			return num;
		return num;
	}
	
	public static boolean isTaken(int num)
	{
		TicTacToe game=new TicTacToe();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(game.tictac[i][j]==num)
				{
					return false;
				}
			}
		}return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}