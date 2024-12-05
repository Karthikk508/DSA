public class IfandElse {
    public static void main(String[] args) {

        int salary = 25400;

        if(salary<10000)
        {
            salary += 100;
        }
        else if(salary>2000000) salary+=200;
        else salary+=1000;

        System.out.println(salary);
    }
}
