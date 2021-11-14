
public class IntStack extends LinkedList {
	private LinkedList list= new LinkedList();
	private int top=-1;

	public boolean isEmpty()
	{
//		return list.isEmpty();
		return (top == -1);
	}

	public void push(int element)
	{
		list.insertAtEnd(element);
		top++;
	}
	
	public int pop()
	{
		if (!isEmpty())
		{
			//Returns the element and since top is decremented,
			// the element is removed from the stack.
		    list.deleteEnd();
			return list.getNelement(top--);
			
		}
		else
		{
			System.out.println("Empty stack.");
			return -1;
		}
	}
	// Examines the top most element of the Stack
	public int peek()
	{
		if (!isEmpty())
		{
			//Returns the top most element, without changing
			//top.
			return list.getNelement(top);
		}
		else
		{
			System.out.println("Empty stack.");
			return -1;
		}
	}
}

