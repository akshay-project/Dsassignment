package pkg1;

public class StudentLinkedList {

	private StudentNode head;

	public StudentLinkedList() {

		this.head = null;
	}

//	public void insertStudentdata(int rollno, String name, int marks) {
//
//		StudentNode temp = new StudentNode();
//
//		temp.setRollno(rollno);
//		temp.setName(name);
//		temp.setMarks(marks);
//		temp.setNext(null);
//
//		if (head == null) {
//
//			head = temp;
//
//		} else {
//
//			temp.setNext(head);
//			head=temp;
//
//		}
//
//	}

	public void display()

	{
		StudentNode temp;
		temp = head;

		while (temp.getNext() != null) {

			System.out.println("name :" + temp.getName() + "   " + "rollno : " + temp.getRollno() + "   " + " marks :"
					+ temp.getMarks());
			temp = temp.getNext();

		}
		System.out.println("name :" + temp.getName() + "   " + "rollno : " + temp.getRollno() + "   " + " marks :"
				+ temp.getMarks());

	}

	public void insertAscendingOrder(int rollno, String name, int marks) {

		StudentNode temp = new StudentNode();

		temp.setRollno(rollno);
		temp.setName(name);
		temp.setMarks(marks);
		temp.setNext(null);


		StudentNode curr = head;
		StudentNode prev = head;
		if (curr == null) {
			temp.setNext(null);
		
			head = temp;

		} else {

			if (curr.getMarks() < temp.getMarks()) {

				temp.setNext(curr);
				head = temp;
			} else {
				while ((curr != null) && (curr.getMarks() <temp.getMarks())) {

					prev = curr;
					curr = curr.getNext();
				}
				temp.setNext(prev.getNext());
				prev.setNext(temp);
			}
		}
	}
	public StudentNode removeNode()
	{
		StudentNode temp=head;
		if(head == null)
			return null;
		head=head.getNext();
		System.out.println("Removed Person " + temp.getName()+ " with marks "+ temp.getMarks());
		return head;
		
	}

	

}
