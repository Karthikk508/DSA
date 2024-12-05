package SecondRound_2nd_pdfProblems;

public class Qn_16 {


    public static void main(String[] args) {

        findPath();
    }
    public static void findPath()
    {

        String path = "ULRRDDULR";

        int x = 4 , y = 5;   /// initial starting point

        for(int i = 0; i<path.length(); i++)
        {
            char ch = path.charAt(i);

            switch (ch)
            {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;

                default:
                    break;
            }
        }
        System.out.println("current position = " + x + " " + y);

    }
}
