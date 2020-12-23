package DoubleLinkList;

public class node {
  public int data;
  public node prev;
  public node next;
  
  public node(int data)
  {
	  prev=null;
	  this.data=data;
	  next=null;
  }
  
  //parameterised///
  
public node(node prev,int data, node next)

{
	this.prev=prev;
	this.data=data;
	this.next=next;
}

  }
