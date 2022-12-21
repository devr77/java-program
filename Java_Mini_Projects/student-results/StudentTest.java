//the test class with the main method comes here.

public class StudentTest{
	public static void main(String[] args){
		Results student = new Results("2020-04-12345", 78.90, 89);
		student.setStdNameDg("Olomi Alpha", "CEIT");

		student.display();
	}
}