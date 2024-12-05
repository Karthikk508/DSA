package PreviousQuestions;

public class ShuffleTime {


    public static void findTime(String str){


        char[] arr = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {

            if(i == 2) continue;

            int num = arr[i] - '0';

            if(num <= 2 && num > arr[0] - '0'){
                char temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
            }
        }

        for (int i = 1; i < str.length(); i++) {

            if(i == 2) continue;

            int num = arr[i] - '0';

            if(num <= 4 && num > arr[1] - '0'){
                char temp = arr[i];
                arr[i] = arr[1];
                arr[1] = temp;
            }
        }

        for (int i = 3; i < str.length(); i++) {

            int num = arr[i] - '0';

            if(num <= 5 && num > arr[3] - '0'){
                char temp = arr[i];
                arr[i] = arr[3];
                arr[3] = temp;
            }
        }

        System.out.println(arr);



    }



    public static void main(String[] args) {


        String time = "23:03";
        findTime(time);


    }
}
