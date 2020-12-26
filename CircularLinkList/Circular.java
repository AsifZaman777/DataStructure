package CircularLinkList;

public class Circular
{
	public Node start;
	public Node end;
    public int size;
    
	public Circular()
	{
		start=null;
		end=null;
		size=0;
	}
		
	public int getsize()
	{
		return size;
	}
	
public boolean is_empty()
	{
		if(start==null)
		{
			return true;
		}
		return false;
	}
	
	public void insertion(int item)
	{
		Node newNode=new Node(item);
		
		if (is_empty()) { //list empty
			start=newNode;
			end=newNode;
			newNode.next=start;
		}
		else {
			end.next=newNode;
			end=newNode;
			end.next=start;
		}
		
	}
	
	public void deletion(int pos)
	{
		if(size==1 && pos==1)
		{
			start=null;
			end=null;
			size--;
			
		}
		if(pos==1)
		{
			start=start.next;
			end=start;
			size--;
			
		}
		if(pos==size)
		{
			Node sNode=start;
			Node eNode=start;
			
			while(sNode != end)
			{
				eNode=sNode;
				sNode=sNode.next;		
			}
			end=eNode;
			end.next=start;
			size--;
			
		}
		
	}
	
	public void display()
	{
		Node tNode=start;
		
		
		if (is_empty()) {
			System.out.println("List is empty");
		}
		else {
			 do{  
	                 
	                System.out.print(" "+ tNode.data);  
	               tNode = tNode.next;  
	            }while(tNode != start);  
	            System.out.println();  
		}
	}
}