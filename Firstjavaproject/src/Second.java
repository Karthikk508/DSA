public class Second {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        //array
        int[] arr = {1, 3, 4, 50, 6, 5, 6, 4, 5};
        System.out.println(arr[5]);

        float xl = 1 + 2;
        System.out.println(xl);

        int num=6;

       int result=rec(num);

       System.out.println(result);

    }
    public static int rec(int n)
    {

        if(n<=1)
        return 1;
        else {
            return n*rec(n-1);
        }
    } 

}
