package OOPS.Pillars.Abstraction.Keyword;


abstract class gfg {
    abstract void printInfo();
}


class employee extends gfg {
    void printInfo()
    {
        String name = "aakanksha";
        int age = 21;
        float salary = 55552.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}


public class Example_1{

    public static void main(String[] args)
    {
        gfg s = new employee();
        s.printInfo();
    }
}
