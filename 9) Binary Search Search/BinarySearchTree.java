package pkg1;

public class BinarySearchTree 
{
	private Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void insertNode(int element)
	{
		Node temp= new Node();
		temp.setData(element);
		if(root== null)
			root=temp;
		else
		{
			Node curr, prev;
			curr=root;
			prev=null;
			while(curr!=null)
			{
				prev=curr;
				if(element>curr.getData())
					curr=curr.getRight();
				else
					curr=curr.getLeft();
			}
			if(element>prev.getData())
				prev.setRight(temp);
			else
				prev.setLeft(temp);
		}
	}
	
	public void preOrder(Node node)
	{
		if(node!=null)
		{
			System.out.println(node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	public void inOrder(Node node)
	{
		if(node!=null)
		{
			
			inOrder(node.getLeft());
			System.out.println(node.getData());
			inOrder(node.getRight());
			
			
		}
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	public void postOrder(Node node)
	{
		if(node!=null)
		{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.println(node.getData());
		}
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	
	public void delNode(int element)
	{
		Node curr, prev;
		curr=root;
		prev=null;
		while(curr!=null && curr.getData()!=element  )
		{
			prev=curr;
			if(element>curr.getData())
				curr=curr.getRight();
			else
				curr=curr.getLeft();
		}
		if(curr==null)
			{
			System.out.println("Element not found");
			System.exit(0);
			}
		
		// Delete leaf Node
		else if(curr.getRight()==null && curr.getLeft()==null)
			{
				if(element>prev.getData())
					prev.setRight(null);
				else
					prev.setLeft(null);
			}
		// Delete Node having One Child (will also work for Delete Leaf Node)
		else if(curr.getLeft()==null || curr.getRight()==null)
		{
			if(element> prev.getData())
			{
				if(curr.getLeft()!=null)
					prev.setRight(curr.getLeft());
				else
					prev.setRight(curr.getRight());
			}
			else
			{
				if(curr.getLeft()!=null)
					prev.setLeft(curr.getLeft());
				else
					prev.setLeft(curr.getRight());
			}
		}
		
	}
	
	public Node search(int element)
	{		
		Node curr= new Node();
		curr=root;
		while(curr!=null)
		{
			if(curr.getData()==element)
				{
				System.out.println(element+" is found at "+ curr);
				return curr;
				}
			if(element>curr.getData())
				curr= curr.getRight();
			else
				curr= curr.getLeft();
		}
		System.out.println(element+" not found");
		return null;
	}
}

