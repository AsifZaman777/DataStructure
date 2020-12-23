package DoubleLinkList;

public class Double {
public node start;
public int size;

public  Double()
{
	start=null;
	size=0;
}

public int get_size()
{
	return size;
}

public void insert_front(int item)
{

	if(start==null)
	{
		start=new  node(null, item, null);
	}
	
	else {
		node newNode=new node(null, item, start);
		start.prev=newNode;
		start=newNode; //start moved //
	}
	size++;
}

public void insert_Pos(int pos,int item)
{
   	if(start==null)
   	{
   		node newNode=new node(null,item , null);
   		start=newNode;
   	}
   	if(pos>=1)
   	{
   		node current=start;
   		for(int i=1;i<pos;i++)
   		{
   			current=current.next;
   	    }
   		if (current.prev==null) {
			node newNode=new node(null, item, current);
			current.prev=newNode;///link with previous//
			start=newNode;
		}
   		else {
		node newNode=new node(current.prev, item, current);
		current.prev.next=newNode;
		current.prev=newNode;
					
		}
   		size++;
   	}
   
}

public void insert_last(int item)
{
	if(start==null)
	{
		start=new  node(null, item, null);
	}
	else {
		node current=start;
		
		while(current.next!=null)
		{
			current=current.next;
		}
		node newNode=new node(current, item, null);
		current.next=newNode;
		}
size++;
}

public void delete_first()
{
	if(start==null)
	{
		System.out.println("Nothing to delete");
	}
	else {
		start=start.next;
		start.prev=null;
		size--;
	}
}

public void delete_pos(int pos)
{
	if(start==null)
	{
		System.out.println("Nothing to delete");
	}
	if (pos<1 || pos>size) {
		System.out.println("Invalid position");
	}
	if(pos>=1)
	{
		
		node currentNode=start;
		
		for(int i=1;i<pos;i++)
		{
			currentNode=currentNode.next;
		}
		if (currentNode.next==null) {
			currentNode.prev.next=null;
		}
		else if (currentNode.prev==null) {
			
			start=currentNode.next;
		}
		else {
		 currentNode.prev.next=currentNode.next;
		 currentNode.next.prev=currentNode.prev;
			
		}
		size--;
	}
}

public void delete_last()
{
	if(start==null)
	{
		System.out.println("Nothing to delete");
	}
	
	if(start.next==null) //one item
	{
		start=null;
		size--;
	}
	else {
		node currentNode=start;
		while(currentNode.next!=null)
		{
			currentNode=currentNode.next;
		}
		currentNode.prev.next=null;
		size--;
	}
}

public void display()
{
	node currentNode=start;
	while(currentNode != null)
	{
		System.out.println(currentNode.data);
		currentNode=currentNode.next;
	}
	
}

}
