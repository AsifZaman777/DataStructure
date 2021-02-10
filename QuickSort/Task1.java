package QuickSort;

public class Task1 {
	
	public int partition(char A[], int left, int right)
    {
       char pivot = A[right];
       int i = left-1;
       for(int j = left; j < right; j++)
    {
        if (A[j] >= pivot)
        {
            i++;
            
            char temp = A[i];
            A[i]= A[j];
            A[j]= temp;
        }
    }

    char temp = A[i+1];
    A[i+1] = A[right];
    A[right] = temp;

    return i+1 ;

    }

public void sorting(char A[], int left, int right)
{
	int partition_index;
	
    if(left < right)
    {
        partition_index = partition(A, left, right);
        sorting(A, left, partition_index - 1);
        sorting(A, partition_index + 1, right);
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
     String s="QUICKSORT";
     int size=s.length();
     char A[]=new char[s.length()];
     
     for(int i=0;i<s.length();i++)
     {
    	 A[i]=s.charAt(i);
     }
	Task1 t=new Task1();
	t.print(A, size);
	t.sorting(A, 0, size-1);
	t.print(A, size);
	
	
	
}


}
