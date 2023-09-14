public class Employee {
    private String firstName;
    private String lastName;
    private String surName;
    private int department;
    private int salary;
    private int id;

    public Employee(String firstName, String lastName, String surName, int department, int salary, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
        this.id = id;

    }

    @Override
    public String toString() {
        return " " + id + " " + firstName + " " + lastName + " " + surName + " " + department + " " + salary;
    }

    public String toString1() {
        return lastName + " " + firstName + " " + surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
