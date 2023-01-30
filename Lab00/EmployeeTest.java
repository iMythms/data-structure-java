package Lab00;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setID(905127);
        e1.setName("Mytham");
        e1.setPosition("Developer");
        e1.setSalary(5000);

        e1.display();
        System.out.println(e1);
    }
}
