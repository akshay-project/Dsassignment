package LinkedList;

public class TestRotateList 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
//		list.insertAtFront(10);
//		list.insertAtFront(5);
//		list.insertAtEnd(20);
//		list.insertAtEnd(40);
//		list.traverse();
//		System.out.println("key as 20");
//		list.rotateList(20);
//		list.traverse();
//		System.out.println("key as 5");
//		list.rotateList(5);
//		list.traverse();
		list.insertAscending(5);
		list.insertAscending(2);
		list.insertAscending(9);
		list.insertAscending(13);
		list.insertAscending(15);
		list.insertAscending(4);
		list.insertAscending(1);
		list.traverse();
	}

}
