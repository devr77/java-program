public class Employee {

    String name;
    int id;
    String salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    void salaryGrd() {
        if (id < 10) {
            System.out.println("Salary grade is SGD!");
        } else if (id >= 10 && id <= 50) {
            System.out.println("Salary grade is SGD2!");
        } else {
            System.out.println("Salary grade is SGD3!");
        }
    }


    String getDetail(String name, int id, String salary) {
        return String.format("Name: %s ID: %d Salary : %s", name, id, salary);
    }


}
