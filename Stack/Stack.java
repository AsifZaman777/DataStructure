package DataStructure;


public class Stack {

	static int arr[]=new int[5];
	static int top;
	
	public Stack()
	{
		top=-1;
	}
	public static void push(int item)
	{
		if(top==4)
		{
			System.out.println("Stack full");
		}
		else {
			{
				top++;
				arr[top]=item;
			}
		}
	}
	
	///POP method///
	
	public void pop()
	{
		/// check -> are any element available in stack?///
		
		if(top!=-1)
		{
			System.out.println("Pop elemnt : "+arr[top]);
			top--;
		}
		else {
			System.out.println("Empty stack");
		}
		
	}
	
	public void display()
	{
		System.out.println(" ");
		for(int i=top;i>=0;i--)
		{
         System.out.println(arr[i]+" ");
		}
	}

	}

