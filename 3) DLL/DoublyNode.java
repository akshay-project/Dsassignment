
public class DoublyNode 
{
	private int data;
	private DoublyNode next;
	private DoublyNode prev;
	public DoublyNode()
	{
		data = 0;
		next = null;
		prev=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	
	
}
