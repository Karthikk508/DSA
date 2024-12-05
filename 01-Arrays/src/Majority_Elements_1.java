public class Majority_Elements_1 {

    public static int majorityElement(int[] arr)
    {
        int element = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(count == 0)
            {
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]){

                count++;
            }
            else {
                count--;
            }
        }
        return element;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }


}
