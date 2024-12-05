package OOPS.Pillars.Abstraction.Keyword;


abstract class karthik
{
    abstract void play();

    void concrete()
    {
        System.out.println("concrete");
    }
}

class Sports extends karthik {

    void play(){

        System.out.println("Lets play cricket");

    }
    void fun()
    {

    }


}

public class Example_2 {

    public static void main(String[] args) {

        Sports s  = new Sports();
        s.fun();
        s.play();
    }

}