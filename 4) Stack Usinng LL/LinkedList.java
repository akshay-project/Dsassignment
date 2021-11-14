
public class LinkedList {
	private Node head;
	public LinkedList()
	{
		head = null;
	}
	public void insertAtFront(int element)
	{
		Node temp;
		temp = new Node();
		temp.setData(element);
		temp.setNext(null);
		if (head == null)
		{
			head = temp;
		}
		else
		{
			temp.setNext(head);
			head = temp;
		}	
	}
	
	public void insertBefore(int belement, int element )
	{
		Node current;
		current = head;
		Node prev= new Node();
		Node temp;
		temp = new Node();
		temp.setData(element);
		temp.setNext(null);
		
		if(head==null )
		{
			System.out.println("Linked list is empty");
		}
		
		else if(current.getData()==belement)
		{
			this.insertAtFront(element);
		}
		
		else
		{	
		while(current.getData()!= belement)
		{
			prev=  current;
			current=current.getNext();
		}
		temp.setNext(current);
		prev.setNext(temp);
		}
	}
	
	public void insertAfter(int belement, int element )
	{
		Node current;
		current = head;
		Node temp;
		temp = new Node();
		temp.setData(element);
		temp.setNext(null);
		
		if(head==null )
		{
			this.insertAtFront(element);
		}
		
		else
		{	
		while(current.getData()!= belement)
		{
			current=current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		}
	}
	
	public void insertAtEnd(int element)
	{
		Node current;
		current = head;
		Node temp;
		temp = new Node();
		temp.setData(element);
		temp.setNext(null);
		if(head==null )
		{
			this.insertAtFront(element);
		}
		else
		{	
		while (current.getNext() != null) 
		{
			current = current.getNext();
		}
		current.setNext(temp);
		}
	}
	
	public void insertAtPosition(int position, int element )
	{
		Node current;
		current = head;
		Node prev= new Node();
		Node temp;
		temp = new Node();
		temp.setData(element);
		temp.setNext(null);
		int count= 1;
		if(head==null )
		{
			System.out.println("Linked list is empty");
		}
		
		else if(position==1)
		{
			this.insertAtFront(element);
		}
		
		else
		{	
		while(count< position)
		{
			prev=  current;
			current=current.getNext();
			count++;
			
		}
		temp.setNext(current);
		prev.setNext(temp);
		}
	}
	
	
	public void traverse()
	{
		Node temp;
		temp = head;
		while (temp != null) 
		{
			System.out.println("Ref. of head : " + head);
			System.out.println("Ref. of temp : " + temp);
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public boolean isEmpty()
	{
		if (head==null)
			{
			System.out.println("Empty");
		    return true;
			}
		else
			return false;
	}
	
	public void deleteNode(int element)
	{
		if(!isEmpty())
		{	
		
		Node current;
		Node prev=null;
		current = head;
		if(head.getData()==element)
		{
			
			head=head.getNext();
			current.setNext(null);
			
		}
		
		else
		{	
		while(current.getData()!= element)
		{
			prev=current;
			current=current.getNext();
		}
		prev.setNext(current.getNext());
		current.setNext(null);
		}
		}
	}
	
	public void deleteEnd()
	{
		if(!isEmpty())
		{	
		
		Node current;
		Node prev=null;
		current = head;
		if(head.getNext()==null)
		{
			head=null;	
		}
		
		else
		{	
		while(current.getNext()!= null )
		{
			prev=current;
			current=current.getNext();
		}
		prev.setNext(null);
		
		}
		}
	}
	
	public int getNelement(int n)
	{
		Node temp;
		temp = head;
		int count=0;
		
		while (count<n) 
		{
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}
	
}

