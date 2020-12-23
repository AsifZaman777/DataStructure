package Tree;

import java.util.Scanner;


public class Recurtion {


public static int rec(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else {
			return n*rec(n-1);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("Please insert a digit : ");
	 int n=scanner.nextInt();
	System.out.println(rec(n));	
		
	}
	
	
}
