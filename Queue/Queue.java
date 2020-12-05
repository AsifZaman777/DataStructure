package DataStructureLab;
public class Queue 
{
   int rear;
   int front;
   
   int arr[]=new int[5];
   
 public Queue() {
	   front=-1;
	   rear=-1;}
  public void insert(int item)
  {
	  if(rear==4)
	  {
		  System.out.println("Queue overflow");
		  return;}
	 
	  else {
		  front=0;
		  rear++;
		  arr[rear]=item;}}
	 public void Delete()
  {
	  if (front==-1)
	  {
		  System.out.println("Queue is empty");
	  return;
	  }
	  if(front==rear)
	  {
		  rear=-1;
		  front=-1;
	  }
	  else 
	  {
		  System.out.println("Deleted element : "+arr[front]);
		 front++; 
	  }}
  
	 public void display()
  {
	  if(front==-1)
	  {
		  System.out.println("No element in the queue");
	  }
	  else {
		  {
			   for(int i=front;i<=rear;i++)
				  {
				   System.out.println(arr[i]);
				  }
			  } }} }
   

