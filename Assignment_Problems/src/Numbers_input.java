import java.util.Scanner;
public class Numbers_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int negative_sum = 0;
        int positive_even_sum = 0;
        int positive_odd_sum = 0;
        while(true)
        {
            int n = in.nextInt();
            if(n==0)
            {
                break;
            }
            else if (n<0)
            {
                negative_sum += n;
            }
            else if(n%2 == 0)
            {
                positive_even_sum += n;
            }
            else{
                positive_odd_sum += n;
            }
        }

        if(negative_sum!=0) System.out.println("Negative sum is = " + negative_sum);
        if(positive_even_sum!=0) System.out.println("Positive even sum is =" + positive_even_sum);
        if(positive_odd_sum!=0) System.out.println("Positive odd sum is =" + positive_odd_sum);
        else System.out.println("byeee");

    }
}
