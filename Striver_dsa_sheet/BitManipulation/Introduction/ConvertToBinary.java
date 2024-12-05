package BitManipulation.Introduction;

public class ConvertToBinary {

    public static void main(String[] args) {

        StringBuilder ans = new StringBuilder();
        int n = 2;
        ans.append(n%2);
        rec(ans,n);
        System.out.println(ans);

    }

    public static void rec(StringBuilder s,int num)
    {
        if(num / 2 == 1)
        {
            s.append(num % 2);
            return;
        }

        rec(s,num/2);
        s.append(num % 2);
    }
}
