package PracticeQuestions.EmployeeDatabase;

public class User {

    private String name;
    private int age;
    private String designation;
    private String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public User(String name, int age, String designation, String department) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
