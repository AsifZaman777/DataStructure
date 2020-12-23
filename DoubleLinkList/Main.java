package DoubleLinkList;

public class Main {
public static void main(String[] args)
{
	Double d=new Double();
	d.insert_front(10);
	d.insert_last(5);
	d.insert_Pos(2, 23);
	d.insert_Pos(3, 56);
	d.insert_Pos(4, 89);
	d.insert_Pos(5, 8);
	d.insert_Pos(6, 52);
	d.insert_Pos(7, 23);
	
	d.delete_pos(2); ///23 deleted
	
	
	d.display();
	System.out.println("\nSize of the List : "+d.get_size());
	
}
}
