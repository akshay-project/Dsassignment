
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtFront(5);
		list.insertAtFront(10);
		System.out.println("After 2 nodes");
		list.traverse();
		list.insertAtFront(12);
		list.insertAtFront(7);
		System.out.println("After 4 nodes");
		list.traverse();
		System.out.println("Insert Before");
		list.insertBefore(10, 15);
		list.insertBefore(7, 25);
		list.traverse();
		System.out.println("Insert After");
		list.insertAfter(12, 30);
		list.insertAfter(25, 35);
		list.insertAfter(5, 40);
		list.traverse();
		System.out.println("Insert At End");
		list.insertAtEnd(50);
		list.traverse();
		
		System.out.println("Insert At Position");
		list.insertAtPosition(5, 60);
		list.insertAtPosition(1, 70);
		list.insertAtPosition(12, 80);
		list.insertAtPosition(14, 90);
		list.traverse();
		System.out.println("Delete Element");
		list.deleteNode(70);
		list.deleteNode(60);
		list.traverse();
		System.out.println("Delete End");
		list.deleteEnd();
		list.traverse();
		System.out.println(list.getNelement(0));
		System.out.println(list.getNelement(3));
//		full check of deleteElement
//		list.insertAtEnd(10);
//		list.insertAtEnd(20);
//		list.insertAtFront(30);
//		list.insertAtEnd(40);
//		list.traverse();
//		list.deleteNode(30);
//        list.deleteNode(20);
//		list.deleteNode(10);
//		list.deleteEnd();
//		list.deleteEnd();
//		list.traverse();
}
}