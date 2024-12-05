import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        // Degree celcius to Farenheit

        System.out.println("Enter the Celcius value of temperature");

        Scanner input = new Scanner(System.in);

        float cel = input.nextInt();

        float result = (cel * 9/5) + 32;

        System.out.println( "The value in farenheit is " +result );

    }
}
