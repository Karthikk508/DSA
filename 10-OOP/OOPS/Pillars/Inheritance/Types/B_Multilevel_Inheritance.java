package OOPS.Pillars.Inheritance.Types;


class One {

    int age;

    public void print_geek() {
        System.out.println("Geeks");
    }
}

class Two extends One {

    public void aVoid(int age)
    {
        super.age = age;

    }

    public void print_for() {
        System.out.println("for");
    }
}

class Three extends Two {

    public void print_lastgeek() {
        super.print_for();
        System.out.println("Geeks");
    }
}


public class B_Multilevel_Inheritance {

    public static void main(String[] args) {

        Three g = new Three();

        g.print_geek();
        g.print_for();
        g.print_lastgeek();
    }
}
