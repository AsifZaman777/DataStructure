package Tree;


public class Main {
  public static void main(String[] args)
  {
	  bst tree=new bst();
	 tree.insert(20);
	 tree.insert(40);
	 tree.insert(50);
	 tree.insert(60);
	 tree.insert(70);
	 tree.insert(10);
	 tree.insert(12);
	 
	 System.out.println("Pre order  :");
	 tree.preorder(tree.root);
	 System.out.println("Post order :");
	 tree.postorder(tree.root);
	 System.out.println("In order   :");
	 tree.inorder(tree.root);
	 Node n=tree.search(tree.root,50);
	
	if (n==null) {
		System.out.println("\nElement Not found");
	}
	else {
		System.out.println("\nSearched Node : "+n);
	}
  }
}
