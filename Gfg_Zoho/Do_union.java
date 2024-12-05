public class Do_union {
    public static void main(String[] args) {

        int[] arr1 = {85,25,5,5,6,4,5,8,9};
        int[] arr2 = {85,2,4,5};
        int n = 9;
        int m = 4;

        System.out.println(doUnion(arr1, n, arr2, m));


    }
    public static int doUnion(int[] a, int n, int[] b, int m)  {


        if(n<m)
        {
            int temp = n;
            n = m;
            m = temp;
        }

        int count = n+m;

        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(b.length>a.length)
                {
                    if(a[i] == b[j])
                    {
                        count--;
                        break;
                    }
                }
                else
                {
                    if(b[i] == a[j])
                    {
                        count--;
                        break;
                    }
                }

            }
        }
        return count;

    }

}
