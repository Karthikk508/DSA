package Applications.Practice.EmployeeDatabase;

class Details {

    String Name;
    int Age;
    String Designation;
    String Dept;
    String managed;

    Details(String name,int age,String designation,String dept,String M_name)
    {
        this.Name = name;
        this.Age = age;
        this.Designation = designation;
        this.Dept = dept;
        this.managed = M_name;
    }

}
