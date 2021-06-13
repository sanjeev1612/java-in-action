package starterJava;

public class EmployeeTest {
  public static void main(String[] args) {
    var employee =new Employee(1, "Sanjeev",2000);
    employee.setId(3);
    System.out.println(employee);
  }
}
