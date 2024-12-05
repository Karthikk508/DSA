public class Final {

    public static void main(String[] args) {

        A karthik = new A("Ooops");
        System.out.println(karthik.name);

        A obj;

        for (int i = 0; i < 1000000000; i++) {

            obj = new A("Happie");

        }


    }
}
class A {

    final int num = 10;
    String name;
    public A(String name)
    {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
