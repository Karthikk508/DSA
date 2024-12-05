package SecondRound_2nd_pdfProblems;

public class Qn_23 {


    public static void main(String[] args) {

        //print(1212);
        //pseudoBinary(25412);

        pseudoBinary(25412);

    }

    public static void pseudoBinary(int n)
    {

        int m = n;

        while(m > 0){

            int temp = m , p = 1 , s = 0;

            while(temp > 0){

                int digit = temp % 10;
                temp /= 10;
                if(digit != 0) s += p;

                p *= 10;
            }
            System.out.println(s);
            m = n - s;
            n = m;
        }

    }

    public static void print(int n){


        int tens = n / 10;

        int ones = n % 10;


        while(tens > 0){

            if(ones > 0) System.out.print(11 + " ");
            else {
              System.out.print(10 + " ");
            }
            tens--;
            ones--;
        }

        while(ones > 0){
            System.out.print(1 + " ");
            ones--;
        }

        System.out.println();
    }
}