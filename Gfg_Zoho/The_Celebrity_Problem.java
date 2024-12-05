public class The_Celebrity_Problem {

    public static void main(String[] args) {

        int[][] k = {{0,0,0,1,0},
                     {1,0,0,0,0},
                     {1,0,0,0,0},
                     {0,0,0,0,0},
                     {0,0,0,1,0}};
        System.out.println(celebrity(k,5));
    }

    public static int celebrity(int[][] M, int n)
    {
        // code here
        int i = 0, j = n - 1;
        while (i < j) {
            if (M[j][i] == 1) // j knows i
                j--;
            else // j doesnt know i so i cant be celebrity
                i++;
        }
        // i points to our celebrity candidate
        int candidate = i;

        // Now, all that is left is to check that whether
        // the candidate is actually a celebrity i.e: he is
        // known by everyone but he knows no one

        for (i = 0; i < n; i++) {

            if (i != candidate)
            {
                if (M[i][candidate] == 0 || M[candidate][i] == 1)
                    return -1;
            }
        }
        // if we reach here this means that the candidate
        // is really a celebrity
        return candidate;

    }
}


    
//        // code here
//        int ans = 0 , count = 0;
//        for(int i = 0; i<n; i++)
//        {
//boolean flag = true;
//            for(int j = 0; j<n; j++)
//        {
//        if(M[i][j] == 1)
//        {
//flag = false;
//        break;
//        }
//        }
//
//        if(flag) {
//ans = i;
//count++;
//        }
//        }
//        if(count > 1 )
//        {
//        return -1;
//        }
//        if(count == 1)
//        {
//        return ans;
//        }
//                return -1;