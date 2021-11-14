

public class StackCheck  {

	public static void main(String[] args) {
		
	//    
			
			IntStack st = new IntStack();
			st.push(12);
			st.push(2);
			st.push(5);
			st.push(7);
			st.push(15);
			System.out.println("Peek:" + st.peek());
			System.out.println(st.pop());
			System.out.println(st.pop());
			st.push(20);
			st.push(14);
			
			while (!st.isEmpty())
			{
				System.out.println(st.pop());
			}
			System.out.println(st.pop());
			
		}
}
