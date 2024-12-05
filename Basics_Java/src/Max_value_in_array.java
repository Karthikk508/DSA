public class Max_value_in_array {
    public static void main(String[] args) {

        int[] frr = {1,99,2,4,5,101,4,5,4,5,1,0,10};
        Maxvalue(frr);

    }

    static void Maxvalue(int[] arr)
    {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>temp) temp=arr[i];
        }
        System.out.println(temp);
    }

}
