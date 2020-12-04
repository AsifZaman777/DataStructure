package LinkList;

public class Node {
int data;
Node next;

public Node()
{
	data=0;
	next=null;
	}
public Node(int d, Node n)
{
	data=d;
	next=n;
}
//setter getter///
public void setData(int d)
{
	data=d;
}

public void setNext(Node n)
{
	next=n;
}

public int getData()
{
	return data;
}
public Node getNext()
{
	return next;
}
}
