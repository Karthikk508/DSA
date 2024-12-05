package SecondRound_2nd_pdfProblems;

public class Qn_35 {

    // 3 5 4 2
    // 2 4 5
    // 4 5 6 7 8
    // 4 9 2 1
    // 1 2


    public static void main(String[] args) {


        int[][] arr = {{4,5,6,7,8},
                       {0,0,2,4,5},
                       {0,3,5,4,2},
                       {0,4,9,2,1},
                       {0,0,0,1,2}};

        find(arr);


    }
    public static void find(int[][] arr){


        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i][0];
            for (int j = 1; j < arr[0].length; j++) {
                sum = (sum*10) + arr[i][j];
            }
            totalSum += sum;
        }

        System.out.println(totalSum);



    }

}
