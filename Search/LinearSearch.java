package DataStructure;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
	System.out.print("Please input your array size : ");
	int n=input.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Index No "+i+" :");
		arr[i]=input.nextInt();
	}
	
	System.out.print("Element want to search : ");
	int search=input.nextInt();
	int poss=-1;
	///read array again///
	for(int i=0;i<arr.length;i++)
	{
		if(search==arr[i])
		{
			poss=i;
			System.out.println("Element found in "+poss+" index");
			
		}
		
	}
	if (poss==-1) {
		System.out.println(":(:(:(:(:(:( Searching failed :(:(:(:(:(:( ");
	}	
}
}
