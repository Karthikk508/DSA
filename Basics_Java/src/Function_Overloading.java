public class Function_Overloading {
    public static void main(String[] args) {
        fun(1,2,2);
        fun(5,6);
        fun("karthik");

    }
    static void fun(int a,int b, int c)
    {
        int d = a+b+c;
        System.out.println(d);
    }
    static void fun(int e,int f)
    {
        int k = e+f;
        System.out.println(k);
    }
    static void fun(String name)
    {

        System.out.println(name);
    }



}
