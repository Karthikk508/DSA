import static PreviousQuestions.SortOddAndEven.find;

public class Test1 {

    public static void main(String[] args) {

        int[] arr = {9,3,3,3,9};

        find(arr);
    }

    public static int find(int[] arr){

        int count = 0;


        for (int i = 0; i < arr.length; i++) {

            int prefix = arr[i];

            for (int j = i+1; j < arr.length; j++) {

                prefix += arr[j];

                if(arr[i] == arr[j]) {

                    int temp = arr[i];

                    prefix -= (2*temp);

                    if(prefix == temp){
                        count++;
                    }
                }
            }

        }

        System.out.println(count);

        return count;
    }
}
