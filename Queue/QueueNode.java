package Queue;

public class QueueNode 
{
	private int data;
	private QueueNode next;
	public QueueNode()
	{
		data = 0;
		next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
}
