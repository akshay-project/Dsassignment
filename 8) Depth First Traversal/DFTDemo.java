package pkg;

public class DFTDemo 
{

	public static void main(String[] args) 
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertNode(50);
		tree.insertNode(60);
		tree.insertNode(70);
		tree.insertNode(55);
		tree.insertNode(45);
		tree.insertNode(75);
		tree.insertNode(30);
		tree.insertNode(45);
		//tree.preorder();
		tree.dft();

	}

}
