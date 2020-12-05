package DataStructureLab;

public class InfixPostfixStack {
	
	int size;
	char stack[];
	int top;
    char collect;
    
	public InfixPostfixStack(int length)
	{
		top=-1;
	    size=length;
	    stack=new char[length];
	}
	public boolean isempty()
	{
		if(top==-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(char item)
	{
		if(top==size-1)
		{
			System.out.println("Your stack is full");
		}
		else {
			top++;
			stack[top]=item;
		}
	}
	
	public char pop()
	{
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		else {
			
			collect=stack[top];
			top--;
			}
		return collect; ///returning top///
	}
	
	public char check()
	{
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		
		return stack[top];
		}
	
	public void display()
	{
		if(isempty())
		{
			System.out.println("Nothing to display");
		}
		else {
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]+" ");
			}
		}
	}
	
	

}
