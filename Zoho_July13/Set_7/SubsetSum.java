package Set_7;

public class SubsetSum {

    public static void main(String[] args) {

        int[] arr = {2,3};
        generate(0,0,arr);


    }
    public static void generate(int ind,int sum,int[] arr)
    {
        if(ind == arr.length)
        {
            System.out.println(sum);
            return;
        }
        sum += arr[ind];
        generate(ind+1,sum,arr);
        sum -= arr[ind];
        generate(ind+1,sum,arr);
    }
}
