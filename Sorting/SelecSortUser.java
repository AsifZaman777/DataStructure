package DataStructure;

import java.util.Scanner;

public class SelecSortUser {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	
	System.out.print("Please input your arrray size : ");
	int temp;
	int ci;
	int size=in.nextInt();
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
	}
	
	
	///size-1 first loop///
	
	for(int i=0;i<size-1;i++)
	{
		ci=i;
		for(int j=i+1;j<size;j++)
		{
			if(arr[ci]>arr[j])
			{
				ci=j; 
			}
			
			temp=arr[ci];     
			arr[ci]=arr[i];  
			arr[i]=temp;
			}
		
		System.out.println(" ");
	}
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	
	
	
}
}
