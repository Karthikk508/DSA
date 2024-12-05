
import java.util.Scanner;

class Foo{
    static String text = "Foo";
}
class Bar extends Foo{
    void printText(){
        System.out.println(Foo.text);
    }

}

public class test {
    public static void main(String[] args) {
       
        String t = "hiheyhello";
        int index = t.lastIndexOf("h",4);
        System.out.println(index);
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        System.out.println(c);
    }

}
