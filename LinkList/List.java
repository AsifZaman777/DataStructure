package LinkList;

public class List {
int size;
Node start;

public List()
{
	size=0;
	start=null;
	
}
public boolean is_empty()
{
	if(start==null)
	{
		return true;
	}
	else {
		return false;
	}
}

public int getLinkSize()
{
	return size;
}

public void insertAtFirst(int val)
{
	Node n=new Node();
	n.setData(val);
	n.setNext(start);
	start=n;
	size++;
}

public void insertAtLast(int val)
{
	Node t;
	Node n=new Node();
	n.setData(val);
	t=start;
	if(start==null)
	{
		start=n;
	}
	
	else {
		while(t.getNext() !=null)
		{
			t=t.getNext();
		}
		t.setNext(n);
		size++;
	}
}

public void insertAtPos(int val,int pos)
{
	
	if(pos==1)
	{
		insertAtFirst(val);
	}
	
	else if (pos==size+1) {
		insertAtLast(val);
	}
	
	else if(pos>1 && pos<=size){
		
		Node n=new Node(val,null);
		Node t;
		t=start;
		for (int i = 1; i <pos-1;i++) {
		 t=t.getNext();
		 }
		n.setNext(t.getNext());
		 t.setNext(n);
		size++;
	}
	
	else {
		System.out.println("Insertion not possible");
	}
}

public void deleteFirst()
{
	if(start==null)
	{
		System.out.println("list is empty");
	}
	else {
		start=start.getNext();
		size--;
	}
}

public void deleteLast()
{
	if(start==null)
	{
		System.out.println("List is empty");
	}
	else if(size==1)
	{
		start=null;
	}
	
else {
		Node t;
		t=start;
		for(int i=1;i<size-1;i++)
		{
			t=t.getNext();
		}
		t.setNext(null);
		size--;
	}
}

public void deletePos(int pos)
{
	if(start==null)
	{
		System.out.println("List is empty");
	}
	else if (pos==1) {
		deleteFirst();
	}
	else if (pos==size) {
		deleteLast();
	}
	else if(pos<1&&pos>size)
	{
		System.out.println("Invalid position");
	}
	else {
		Node t,target;
		t=start;
		for(int i=1;i<pos-1;i++)
		{
			t=t.getNext();
		}
		target=t.getNext();
		t.setNext(target.getNext());
		size--;
	}
	
}

public void display()
{
	Node t;
	if(is_empty())
	{
		System.out.println("Nothing to display");
	}
	else {
	  t=start;
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(t.getData());
		  t=t.getNext(); 
	  }
	 ///value of t is updating///
	}
}
}
