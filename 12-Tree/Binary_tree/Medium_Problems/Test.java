package Medium_Problems;


class Test {

    public static void main(String[] args) {
        int var1 = 5;
        int[] var2 = {5};

        doubleIt(var1);
        doubleIt(var2);

        System.out.println(var1);
        System.out.println(var2[0]);
    }

    public static void doubleIt(int x)
    {
        x = x * 2;
    }
    public static void doubleIt(int[] y)
    {
        y[0] = y[0] * 2;
    }

}
