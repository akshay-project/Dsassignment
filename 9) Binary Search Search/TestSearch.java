package pkg1;

public class TestSearch {

	public static void main(String[] args) 
	{
		BinarySearchTree tree =  new BinarySearchTree();
		tree.insertNode(50);
		tree.insertNode(60);
		tree.insertNode(70);
		tree.insertNode(55);
		tree.insertNode(45);
		tree.insertNode(75);
		tree.insertNode(30);
		tree.insertNode(45);
		System.out.println(tree.search(50));
		System.out.println(tree.search(51));
		System.out.println(tree.search(70));
		System.out.println(tree.search(45));
		

	}

}
