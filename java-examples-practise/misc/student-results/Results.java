//then create the results class

public class Results extends Test{

	private double total;
	private String studentName, degreeProg;

	public Results(String regNo, double sub1, double sub2){
		super(regNo);
		super.setScores(sub1, sub2);
		this.total = sub1 + sub2;
	}

	public void setStdNameDg(String studentName, String degreeProg){
		this.studentName = studentName;
		this.degreeProg = degreeProg;
	}

	public void display(){
		super.display();
		System.out.println("The name of the student is " + this.studentName);
		System.out.println("The degree programme of the student is " + this.degreeProg);
		System.out.println("The total score is " + this.total);
	}

}