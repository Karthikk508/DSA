package SecondRound_2nd_pdfProblems;

public class Qn_34 {


    public static void main(String[] args) {


        int[][] arr = {{7,20,3},
                       {4,5,6},
                       {7,8,10}};

        System.out.println(findSum(arr));



    }
    public static int findSum(int[][] arr){


        int leftTriangle = 0 , rightTriangle = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-i; j++) {
                leftTriangle += arr[i][j];
            }
        }
        System.out.println(leftTriangle);

        for (int i = 0; i < arr.length; i++) {
            for (int j = (arr[0].length-1)-i; j < arr[0].length; j++) {
                rightTriangle += arr[i][j];
            }
        }
        System.out.println(rightTriangle);


        return Math.max(rightTriangle, leftTriangle);
    }
}
