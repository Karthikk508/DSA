package SecondRound_2nd_pdfProblems;

public class Qn_10 {

    // maximum chocolates

    public static void main(String[] args) {


        int money = 20;
        int price = 3;
        int wrap = 5;

        find(money,price,wrap);


    }
    public static void find(int money,int price,int wrap)
    {

        int sum = 0 , rem = 0 ,x = money / price;
        sum += x;

        while(x > 0)
        {
            rem = x % wrap;
            x = x / wrap;
            sum += x;
            if(x == 0) break;
            x = x + rem;
        }

        System.out.println(x);

        System.out.println(sum);
    }
}
