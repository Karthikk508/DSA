package Binary_search;

class Sum_of_Square_Numbers {

    public static void main(String[] args) {

        System.out.println(judgeSquareSum(5));
    }
    public static boolean judgeSquareSum(int c) {

        int s = 0;
        int e = (int)Math.sqrt(c);

        while(s <= e)
        {
            if((s*s)+(e*e) == c)
            {
                return true;
            }
            else if((s*s)+(e*e)>e)
            {
                e--;
            }
            else{
                s++;
            }
        }
        return false;
    }
}