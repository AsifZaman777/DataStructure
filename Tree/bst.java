package Tree;

public class bst {
Node root;

public bst()
{
	root=null;
}

///recursively insertion///

public void insert_rec(int val,Node node)
{
	
	Node n=new Node();
	n.value=val; ///value set
	
	if(root==null)
	{
		root=n;
	}
	else {
		///left passing//
		if(val<node.value)
		{
			if (node.left==null) {
				node.left=n;
				return;
			}
			insert_rec(val, node.left);//recursion//
		}
		
		//right passing//
		   else {
			if(node.right==null)
			{
				node.right=n;
				return;
			}
			insert_rec(val, node.right);
		}  
		      
		}
		
	}

///without reucrsion///

public void insert(int item)
{
	Node n=new Node();
	n.value=item;
	

	//if tree is empty//
	
	if(root==null)
	{
		root=n;
	}
	else {
		
		 Node node=root;
		 
		 //the loop will run until the node value is null//
		 while(node !=null)
		 {
			if(item<node.value)
			{
				if(node.left==null)
				{
					node.left=n;
					return;
				}
				else {
					node=node.left;
				}
			}
			else {
				if(node.right==null)
				{
					node.right=n;
					return;
				}
				else {
					node=node.right;
				}
			}
		 }
	}
	
}

//search value///

public Node search(Node node,int val)
{
	if(node==null || node.value==val)
	{
		return node;
	}
	if (node.value<val) {
		return search(node.right,val);
	}
	if (node.value>val)
		return search(node.left, val);
	
	return node;
	}

///tree traverseal///
	
	public void preorder(Node node)
	{
		System.out.println(node.value);
		if(node.left!=null)
		{
			preorder(node.left);
		}
		if (node.right != null) {
			preorder(node.right);
		}
	}
	
	public void inorder(Node node)
	{
		if(node.left !=null)
		{
			inorder(node.left);
		}
		
		System.out.println(node.value);
		
		if(node.right !=null)
		{
			inorder(node.right);
		}
	}
	
	public void postorder(Node node)
	{
		if(node.left !=null)
		{
			postorder(node.left);
		}
		
		if(node.right !=null)
		{
			postorder(node.right);
		}
		System.out.println(node.value);
	}
	
}


