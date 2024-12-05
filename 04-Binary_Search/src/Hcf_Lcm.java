import java.util.Scanner;
public class Hcf_Lcm {
    public static void main(String[] args) {

        int num1=0 ,num2=0 , temp1=0,temp2=0,temp=0;

        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();

        num2 = in.nextInt();

        //Code
        temp1 = num1;
        temp2 = num2;

        while(temp2 != 0)
        {
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        System.out.println("Hcf is " +temp1);

        int hcf = temp1;

        int Lcm = (num1*num2)/hcf;


        System.out.println("Lcm is " +Lcm);

    }
}
