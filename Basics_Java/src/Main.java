import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        //Output
        System.out.println("Hello java");
        System.out.println("Enter the rollno");

        //Input(Integer)
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("The roll no is " +rollno);

        //Input(String) For first word
        Scanner string = new Scanner(System.in);
        String name = string.next();
        System.out.println(name);

        //Input(String) For Full string
        Scanner tring = new Scanner(System.in);
        String sname = tring.nextLine();
        System.out.println(sname);

        //float
        Scanner acc = new Scanner(System.in);
        float res = acc.nextFloat();
        System.out.println("The float value is" +res);


        //Sum of two numbers
        Scanner iinput = new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1 = iinput.nextInt();
        System.out.println("Enter the second value");
        int num2 = iinput.nextInt();

        int sum = num1+num2;

        System.out.println(sum);




    }
}
