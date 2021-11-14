package QueueCircularLL;

public class QueueCircularLL 
{
	private Node front, rear;
	public QueueCircularLL()
	{
		front=null;
		rear= null;
	}
	
	public boolean isEmpty()
	{
		return(rear==null);
//		if(front==null && rear== null)
//		return true; 
//		else
//		return (rear.getNext()==front && rear!=null);
	}
	
	public void enqueue(int element)
	{
		Node temp = new Node();
		temp.setData(element);
		
		if(isEmpty())
		{
			rear=temp;
			front=temp;
			rear.setNext(front);
		}
		
		else
		{
//			front=rear.getNext();
			rear.setNext(temp);
			rear=temp;
			rear.setNext(front);
		}
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		
		else
		{
			Node temp=front;
			int f=front.getData();
			front=front.getNext();
			rear.setNext(front);
			temp.setNext(null);
			return f;
		}
	}
	
	public void traverse()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
		{	
		Node temp;
		temp = front;
		while (temp.getNext() != front) 
		{
			System.out.println("Ref. of head : " + front);
			System.out.println("Ref. of temp : " + temp);
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		}
	}
}
