package pkg1;

import java.util.Scanner;

public class DemoStudentLinkedList {

	public static void main(String[] args) {
		
		System.out.println("enter the rollno, name, marks of students");
		//Scanner sc=new Scanner(System.in);
		StudentLinkedList list=new StudentLinkedList();
		list.insertAscendingOrder(10, "ankit", 10);
		list.insertAscendingOrder(20, "parmanand", 20);
		list.insertAscendingOrder(30, "atul", 30);
		list.insertAscendingOrder(40, "rohan", 40);
		list.display();
		list.removeNode();
		System.out.println("After remove first rank student ");
		list.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
