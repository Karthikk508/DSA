import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.nextLine();

        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();

        switch (fruit)
        {
            case "mango":
                System.out.println("HI");
                break;

            case "Apple":
                System.out.println("Helllo");
                switch (number)
                {
                    case 1:
                        System.out.println("1");
                        break;

                    case 2:
                        System.out.println("2");
                        break;

                    default:
                        System.out.println("bye");
                }
                break;

            default:
                System.out.println("bye");
        }
    }
}
