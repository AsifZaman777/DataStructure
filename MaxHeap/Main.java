package MaxHeap;


public class Main {
	
public static void main(String[] args)
{
	int test[]= {0,55,21,3,6,9,78};
	
	Heap m=new Heap();

	int test_size=test.length-1;
	
	for(int i=test_size;i>=1;i--)
	{
		m.max(i, test,test_size);
	}
	
	
	test_size=m.delete(test_size, test);   ///updated size///
	test_size=m.delete(test_size, test);
	
	for(int i=1; i<=test_size; i++) 
	{
		System.out.println(test[i]);
	
	}
	
	
	
}
}
