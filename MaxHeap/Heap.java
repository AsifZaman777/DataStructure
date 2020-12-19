package MaxHeap;

public class Heap {

	///left=parent*2 right=parent*2 +1///
	
	int maxNode;
	int temp;
	
	public Heap()
	{
		maxNode=0;
	    temp=0;
	}
	
	public void max(int p,int arr[],int size)
	{
		int left=p*2;
		int right=p*2+1;
		int higestIndex=size;
		
		if(left<=higestIndex && arr[p]<arr[left])	
		{
			
			maxNode=left;
		}
		else	
		{
			maxNode=p;
		}
		
		if (right<=higestIndex && arr[maxNode]<arr[right]) 
			{
				maxNode=right;
			}
			
			if (maxNode !=p) 	
			{
				temp=arr[p];
				arr[p]=arr[maxNode];
				arr[maxNode]=temp;
				max(maxNode, arr, size);
			}
			
	}
	
	public int delete(int s,int arr[])
	{
		int last_index=s;
		
		arr[1]=arr[last_index];
		
		last_index--;
		
		max(1, arr, last_index);
		
		return last_index;
	}
	
	
}
