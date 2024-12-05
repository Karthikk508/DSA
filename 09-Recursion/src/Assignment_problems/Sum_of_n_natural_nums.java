package Assignment_problems;

public class Sum_of_n_natural_nums {

    public static void main(String[] args) {
        System.out.println(sum(2));
    }

    public static int sum (int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return n + sum(n-1);
    }

}
