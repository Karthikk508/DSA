public class Count_zeros {

    public static void main(String[] args) {

        System.out.println(fun(200,0));

    }
    // Special pattern // How to pass the value to above calls
    public static int fun(int n , int count)
    {
        if(n%10 == n)
        {
            return count;
        }
        if(n%10 == 0)
        {
            return fun(n/10 , ++count);
        }
        else
        {
            return fun(n/10,count);
        }
    }
}
