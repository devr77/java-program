//then create the test class that inherits features from the student class

public class Test extends Student{
	private double sub1, sub2;

	public Test(String regNo){
		super(regNo);
	}

	public void display(){
		super.display();
		System.out.println("The score for Subject1 is " + this.sub1);
		System.out.println("The score for Subject2 is " + this.sub2);
	}



	public void setScores(double sub1, double sub2){
		this.sub1 = sub1; this.sub2 = sub2;
	}

	public double getSub1(){
		return this.sub1;
	}

	public double getSub2(){
		return this.sub2;
	}
}