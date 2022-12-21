//Create the student class first

public class Student{
	private String regNo;

	public Student(String regNo){
		this.regNo = regNo;
	}

	public void display(){
		System.out.println("The student's registration number is " + this.regNo);
	}

	public String getRegNo(){
		return this.regNo;
	}
}