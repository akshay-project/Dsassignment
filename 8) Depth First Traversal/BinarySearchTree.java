package pkg;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	public void insertNode(int element)
	{
		Node temp = new Node();
		temp.setData(element);
		
		if (root == null)
		{
			root = temp;
		}
		else
		{
			Node curr,prev;
			curr= root;
			prev = null;
			while (curr!=null)
			{
				prev = curr;
				if (element > curr.getData())
					curr = curr.getRight();
				else
					curr = curr.getLeft();
			}
			if (element > prev.getData())
				prev.setRight(temp);
			else
				prev.setLeft(temp);
		}
	}
	
	public void preorder(Node node)
	{
		if (node != null)
		{
			System.out.println(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	// Breadth First Traversal of the tree
	// Queue has to be used.
//	public void bft()
//	{
//		Queue q = new Queue();
//		q.enqueue(root);
//		while (!q.isEmpty())
//		{
//			Node temp = q.dequeue();
//			System.out.println(temp.getData());
//			if (temp.getLeft()!=null)
//				q.enqueue(temp.getLeft());
//			if (temp.getRight()!=null)
//				q.enqueue(temp.getRight());
//		}
//	}
	
	
	// Depth First Traversal of the tree
	// Stack has to be used.
	public void dft()
	{
		Stack s = new Stack();
		s.push(root);
		while (!s.isEmpty())
		{
			Node temp = s.pop();
			System.out.println(temp.getData());
			if (temp.getLeft()!=null)
				s.push(temp.getLeft());
			if (temp.getRight()!=null)
				s.push(temp.getRight());
		}
	}
}
