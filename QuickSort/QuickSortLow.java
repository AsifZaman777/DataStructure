package QuickSort;

public class QuickSortLow {

	
	
	public int partition(int A[],int low, int high)
	{
		int pivot=A[low];
		int i=low+1;
		int j=high;
		int temp;
		
		do {
			while(A[i]<=pivot)
			{
				i++;
			}
			
			while(A[j]>pivot)
			{
				j--;
			}
			
			if(i<j)
			{
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		} while (i<j);
		
		temp=A[low];
		A[low]=A[j];
		A[j]=temp;
		
		return j;
	}
	
	public void q_sort(int A[],int low,int high)
	{
		int partition_index;
		
		if(low<high)
		{
			partition_index=partition(A, low, high);
			q_sort(A, low, partition_index-1);///sub array before pivot
			q_sort(A, partition_index+1, high);///sub array after pivot
		}
	}
	
	
	public void print(int A[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
		System.out.println(" ");
		
	}
	
	public static void main(String[] args)
	{
		int A[] = {3, 5, 2, 13, 12, 3, 2, 13, 45};
		int n=A.length;
		
		QuickSortLow q=new QuickSortLow();
		q.print(A, n);
		q.q_sort(A, 0, n-1);
		q.print(A, n);
		
		
	}
	
}
