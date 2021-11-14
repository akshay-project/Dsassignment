
public class TestDoublyLinkedList {

	public static void main(String[] args) 
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtFront(5);
		list.insertAtFront(10);
		System.out.println("After 2 node at front");
		list.traverseForward();
		list.insertAtEnd(15);
		list.insertAtEnd(20);
		System.out.println("After 2 nodes at end");
		list.traverseForward();
		System.out.println("Backward Traverse");
		list.traverseBackward();
		list.deleteNode(20);
		list.deleteNode(5);
		System.out.println("After delete element");
		list.traverseForward();
		System.out.println("Backward Traverse");
		list.traverseBackward();
	}

}
