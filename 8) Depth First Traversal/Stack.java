package pkg;

public class Stack {
	private Node[] arr;
	private int top;
	public Stack()
	{
		arr = new Node[20];
		top = -1;
	}
	public Stack(int size)
	{
		arr = new Node[size];
		top = -1;
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == arr.length-1);
	}
	public void push(Node element)
	{
		if (!isFull())
		{
			arr[++top] = element;
		}
		else
		{
			System.out.println("Stack is already full.");
		}
	}
	public Node pop()
	{
		if (!isEmpty())
		{
			return arr[top--];
		}
		else
		{
			System.out.println("Empty stack.");
			return null;
		}
	}

	public Node peek()
	{
		if (!isEmpty())
		{
			return arr[top];
		}
		else
		{
			System.out.println("Empty stack.");
			return null;
		}
	}
}

