package OOPS.Pillars.Inheritance.Types;


class One1 {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Two1 extends One {
    public void print_for() { System.out.println("for"); }
}


public class A_Single_Inheritance  {

    public static void main(String[] args)
    {
        Two1 g = new Two1();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
