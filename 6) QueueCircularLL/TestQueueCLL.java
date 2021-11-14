package QueueCircularLL;

public class TestQueueCLL {

	public static void main(String[] args) 
	{
		QueueCircularLL list= new QueueCircularLL();
		System.out.println("Queue is Empty? "+list.isEmpty());
		list.enqueue(20);
		list.enqueue(30);
		list.traverse();
		System.out.println("Removed Element "+list.dequeue());
		list.traverse();
		System.out.println("Removed Element "+list.dequeue());
//		System.out.println("Removed Element "+list.dequeue());
		list.traverse();
		list.enqueue(40);
		list.enqueue(50);
		list.enqueue(20);
		list.enqueue(30);
		list.traverse();
		System.out.println("Removed Element "+list.dequeue());
		System.out.println("Removed Element "+list.dequeue());
		list.traverse();

	}

}
