package Arrays;

import java.util.ArrayList;

class Find_missing_in_array{


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};

        System.out.println(findMissing(a,b,a.length, b.length));
    }

    public static ArrayList<Integer>  findMissing(int a[], int b[],  int N, int M){

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<N; i++)
        {
            boolean flag = true;
            for(int j = 0; j<M; j++)
            {
                if (a[i] == b[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans.add(a[i]);
        }
        return ans;

    }

};