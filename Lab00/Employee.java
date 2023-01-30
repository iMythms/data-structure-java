package Lab00;

public class Employee {
    private int ID;
    private String Name;
    private String Position;
    private double Salary;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getID() {
        return ID;
    }

    public String Name() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void display() {
        System.out.println(
                "Name: " + Name +
                        "\nID: " + ID +
                        "\nPosition: " + Position +
                        "\nSalary: " + Salary);
    }
}