package Applications.Practice.EmployeeDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Details[] employee = new Details[6];

//        for (int i = 0; i < 6; i++) {
//
//            System.out.println("Enter name");
//            String name = in.next();
//            System.out.println("Enter age");
//            int age = in.nextInt();
//            System.out.println("Enter department");
//            String department = in.next();
//            System.out.println("Enter designation");
//            String designation = in.next();
//            System.out.println("Name of the manager");
//            String M_name = in.next();
//
//            Details obj = new Details(name,age,designation,department,M_name);
//            employee[i] = obj;
//
//        }
        employee[0] = new Details("Alice", 30, "Manager", "HR", "None");
        employee[1] = new Details("Bob", 25, "Executive", "HR", "Alice");
        employee[2] = new Details("Charlie", 28, "Executive", "HR", "Alice");
        employee[3] = new Details("David", 22, "Intern", "HR", "Bob");
        employee[4] = new Details("Eve", 35, "Senior Manager", "IT", "None");
        employee[5] = new Details("Frank", 27, "Executive", "IT", "Eve");
        //Details obj1 = new Details("karthik",21,"Ap","EEE");
        //System.out.println(obj1.Age);

        for (Details emp : employee) {
            System.out.print("Name: " + emp.Name);
            System.out.print(" Age: " + emp.Age);
            System.out.print(" Department: " + emp.Dept);
            System.out.print(" Designation: " + emp.Designation);
            System.out.println();

        }

        //Searching by name
//        System.out.println("Enter the name of the employee you want to search");
//        String name = in.next();
//        Details obj2 = searchByName(name,employee);
//
//        if(obj2 != null)
//        {
//            System.out.print("Name: " + obj2.Name);
//            System.out.print(" Age: " + obj2.Age);
//            System.out.print(" Department: " + obj2.Dept);
//            System.out.print(" Designation: " + obj2.Designation);
//            System.out.println();
//        }
//        else {
//            System.out.println("Not found");
//        }

        //Manager name search;
//        System.out.println("Enter the manager name and department that you want to search");
//        String name1  = in.next();
//        String dept = in.next();
//
//        ArrayList<Details> arr = searchByManager(name1,dept,employee);
//
//        for (Details emp : arr) {
//            System.out.print("Name: " + emp.Name);
//            System.out.print(" Age: " + emp.Age);
//            System.out.print(" Department: " + emp.Dept);
//            System.out.print(" Designation: " + emp.Designation);
//            System.out.println();
//        }

        //Creating map for reporting

        HashMap<String, Details> map = new HashMap<>();

        for (int i = 0; i < 6; i++) {

            map.put(employee[i].managed,employee[i]);
        }

        List<Details> temp = new ArrayList<>();

        while(map.get("Alice") != null)
        {
            temp.add(map.get("Alice"));
        }

        for (int i = 0; i < temp.size(); i++) {

            System.out.println(temp.get(i).Name);

            if(map.get(temp.get(i).Name) != null)
            {
                while (map.get(temp.get(i).Name) != null)
                {
                    System.out.println(map.get(temp.get(i).Name).Name);
                }
            }
        }


    }

    private static ArrayList<Details> searchByManager(String name1, String dept, Details[] employee) {

        ArrayList<Details> list = new ArrayList<>();

        for (Details details : employee) {

            if (details.managed.equals(name1) && details.Dept.equals(dept)) {
                list.add(details);
            }
        }
        return list;
    }

    private static Details searchByName(String name, Details[] employee) {

        for(Details emp : employee)
        {
            if(emp.Name.equals(name))
            {
                return emp;
            }
        }
        return null;
    }
}
