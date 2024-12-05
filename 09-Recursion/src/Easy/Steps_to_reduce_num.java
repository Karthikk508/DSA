package Easy;

public class Steps_to_reduce_num {

    public static void main(String[] args) {

        System.out.println(num_of_steps(25));

    }
    public static int num_of_steps(int num)
    {
        return helper(num , 0);
    }

    private static int helper(int num, int steps) {

        if(num == 1)
        {
            return steps;
        }

        if(num % 2 == 0)
        {
            return helper(num / 2 ,++steps);
        }

        return helper(num - 1 , ++steps);
    }
}
