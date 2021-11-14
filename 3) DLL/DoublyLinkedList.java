
public class DoublyLinkedList 
{
    private DoublyNode head;
    private DoublyNode tail;
    public DoublyLinkedList()
	{
		head = null;
		tail = null;
	}
    
    public void insertAtFront(int element)
	{
		DoublyNode temp;
		temp = new DoublyNode();
		temp.setData(element);
		temp.setNext(null);
		if (head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}	
	}
    
    
    public void insertAtEnd(int element)
	{
//		DoublyNode current;
//		current = head;
//		DoublyNode temp;
//		temp = new DoublyNode();
//		temp.setData(element);
//		temp.setNext(null);
//		if(head==null )
//		{
//			this.insertAtFront(element);
//		}
//		else
//		{	
//		while (current.getNext() != null) 
//		{
//			current = current.getNext();
//		}
//		current.setNext(temp);
//		temp.setPrev(current);
//		}
    	DoublyNode temp= new DoublyNode();
    	temp.setData(element);
    	tail.setNext(temp);
    	temp.setPrev(tail);
    	tail=temp;	
	}
    
    public boolean isEmpty()
	{
		if (head==null)
			{
//			System.out.println("Empty");
		    return true;
			}
		else
			return false;
	}
    public void deleteNode(int element)
    {
    	if(!isEmpty())
    	{
    		DoublyNode current;
    		current=head;
    		DoublyNode prevNode=null;
    		if(head.getData() == element)
    		{
    			(head.getNext()).setPrev(null);
    			head=head.getNext();
    			current.setNext(null);
    		}
    		
    		else
    		{	
    		while(current.getData()!= element)
    		{
    			prevNode=current;
    			current=current.getNext();
    		}
    		prevNode.setNext(current.getNext());
    		if(current.getNext()==null)
    		{
    			tail=current.getPrev();
    			current.setNext(null);
        		current.setPrev(null);
    		}
    		else
    		{	
    		(current.getNext()).setPrev(current.getPrev());
    		current.setNext(null);
    		current.setPrev(null);
    		}
    		}
    	}
    }
	
    
    public void traverseForward()
	{
        DoublyNode temp;
		temp = head;
		while (temp != null) 
		{
			System.out.println("Ref. of head : " + head);
			System.out.println("Ref. of temp : " + temp);
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
    
    public void traverseBackward()
   	{
        DoublyNode temp;
   		temp = tail;
   		while (temp != null) 
   		{
   			System.out.println("Ref. of head : " + tail);
   			System.out.println("Ref. of temp : " + temp);
   			System.out.println(temp.getData());
   			temp = temp.getPrev();
   		}
   	}
}
