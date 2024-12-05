import java.util.ArrayList;

public class Break_statements_inLoop {

    public static void main(String[] args) {


        int M=1 ,N=10;


        boolean ans = true;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=M; i<N; i++)
        {
            int j = 2;

            while(j*j <= i)
            {

                if(i%j == 0)
                {
                    ans = false;
                    break;
                }
                j++;
            }

            if(ans == true && i != 1) list.add(i);

        }


        System.out.println(list);


    }
}
