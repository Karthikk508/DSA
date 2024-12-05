package Set_4;


import java.util.Arrays;
import java.util.Comparator;

class Pair{
    int first,second;

    Pair(int start,int end)
    {
        this.first = start;
        this.second = end;
    }
}
public class N_meetingsInOneroom {

    public static void main(String[] args) {



    }
    public static int meetings(int[] start,int[] end,int n)
    {
        Pair[] x = new Pair[n];

        for (int i = 0; i < n; i++) {
            x[i] = new Pair(start[i],end[i]);
        }

        Arrays.sort(x, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1,Pair p2)
            {
                return p1.second - p2.second;
            }
        });

        int last = -1;
        int count = 0;
        for (int i = 0; i < x.length; i++) {

            if(x[i].first > last)
            {
                count++;
                last = x[i].second;
            }
        }
        return count;
    }

}
