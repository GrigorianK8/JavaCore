package homeworks.employeemanagement;

public class Employee {

    private String id;
    private String name;
    private String surname;
    private String phone;
    private Company company;
    private double salary;
    private String position;

    public Employee() {
    }

    public Employee(String id, String name, String surname, String phone, Company company, double salary, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.company = company;
        this.salary = salary;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", company=" + company +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}