package LinkList;

public class ListMain {
public static void main(String[] args)
{
	List l=new List();
    l.insertAtFirst(2);
	l.insertAtPos(3, 2);
	l.insertAtPos(6, 3);
    l.insertAtPos(7, 4);
    l.insertAtLast(8);
	l.display();
}
}
