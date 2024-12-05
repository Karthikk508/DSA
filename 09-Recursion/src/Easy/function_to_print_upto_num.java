public class function_to_print_upto_num {

    public static void main(String[] args) {
      func(5);
      func_rev(5);
    }
    public static void func(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    public static void func_rev(int n)
    {
        if(n == 0)
        {
            return;
        }
        func_rev(n-1);
        System.out.println(n);
    }

    
}
