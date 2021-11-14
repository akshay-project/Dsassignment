package Queue;

public class QueueLL 
{
	private QueueNode front, rear;
	public QueueLL()
	{
		front=null;
		rear= null;
	}
	
	public boolean isEmpty()
	{
		if(front==null && rear== null)
		return true; 
		else
		return (rear.getNext()==front && rear!=null);
	}
	
	public void enqueue(int element)
	{
		QueueNode temp = new QueueNode();
		temp.setData(element);
		
		if(isEmpty())
		{
			rear=temp;
			front=temp;
			
		}
		
		else
		{
			rear.setNext(temp);
			rear=temp;
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
			int f=front.getData();
			front=front.getNext();
			return f;
		}
	}
	
	public void traverse()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
		{	
		QueueNode temp;
		temp = front;
		while (temp != null) 
		{
			System.out.println("Ref. of head : " + front);
			System.out.println("Ref. of temp : " + temp);
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		}
	}
}
