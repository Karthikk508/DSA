package main;

public class def {

    static int i = 10;

    void main()
    {
        int i = 80;
    }
    public static void main(String[] args) {
        change();
        System.out.println(i);
    }
    static int change()
    {
        int i = 22;
        return i;
    }
}
