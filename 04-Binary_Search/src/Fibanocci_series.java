public class Fibanocci_series {
    public static void main(String[] args) {

        int a=0, b=1 , c=0;

        int i=0,n=8;

        while(i<n)
        {
            c = a+b;
            a = b;
            b = c;

            System.out.println(c);
            i++;
        }


    }
}
