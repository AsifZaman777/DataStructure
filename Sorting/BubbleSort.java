package DataStructure;

public class BubbleSort {
	public static void main(String[] args)
	{
		int temp;
      int arr[]= {5,1,8,9,2};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				j--;
				}
			}
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
