
public class main {

    public static int i = 10;

    main () {

        int i = 50;

    }

public static void main(String[] args) {

    change();

    new main();

    System.out.println(i);
}

    static int change() {

        i = 20;

        return i;

    }

}