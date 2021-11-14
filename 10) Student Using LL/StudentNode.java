package pkg1;

public class StudentNode {
	
   private int rollno;
   private String name;
   private int marks;  
   private StudentNode next;

   
   
   public StudentNode() {
	
	this.rollno = 0;
	this.name = "xyz";
	this.marks = 0;
	this.next = null;
}



public int getRollno() {
	return rollno;
}



public void setRollno(int rollno) {
	this.rollno = rollno;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getMarks() {
	return marks;
}



public void setMarks(int marks) {
	this.marks = marks;
}



public StudentNode getNext() {
	return next;
}



public void setNext(StudentNode next) {
	this.next = next;
}
   
   
	
	
	


}
