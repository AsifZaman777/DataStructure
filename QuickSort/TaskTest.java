package QuickSort;

public class TaskTest {
	public int partition(char A[],int low, int high)
	{
		char pivot=A[low];
		int i=low+1;
				
		for (int j = high; j < low; j--) {
			 if (A[j] > pivot)
		        {
		            i++;
		            
		            char temp = A[i];
		            A[i]= A[j];
		            A[j]= temp;
		        }
		}
		
		char temp=A[low];
		A[low]=A[high];
		A[high]=temp;
		
		return i;
	}
	
	public void q_sort(char A[],int low,int high)
	{
		int partition_index;
		
		if(low<high)
		{
			partition_index=partition(A, low, high);
			q_sort(A, low, partition_index-1);
			q_sort(A, partition_index+1, high);
		}
	}
	
	public void print(char A[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
		System.out.println(" ");
		
	}
	
	public static void main(String[] args)
	{
	     String s="QuickSort";
	     int size=s.length();
	     char A[]=new char[s.length()];
	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 A[i]=s.charAt(i);
	     }
		TaskTest tt=new TaskTest();
		tt.print(A, size);
		tt.q_sort(A, 0, size-1);
		tt.print(A, size);
		
		
		
	}
}
