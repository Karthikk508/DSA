package PreviousQuestions;

public class DiagonalMatrix {


    public static void printDiagonal(int[][] arr){


        int i = 0 , n = arr.length * arr[0].length;
        int row = 0 , col = 0;


        while(i < n){

            System.out.println(arr[row][col]);

            if((row+col) % 2 == 0){

                if(col == arr[0].length-1){
                    row++;
                }
                else if(row == 0){
                    col++;
                }
                else{
                    col++;
                    row--;
                }
            }
            else{

                if(row == arr.length-1){
                    col++;
                }
                else if(col == 0){
                    row++;
                }
                else{
                    col--;
                    row++;
                }
            }
            i++;
        }
    }


    public static void main(String[] args) {


        int[][] arr = {{1,2},
                       {3,4}};


        printDiagonal(arr);

    }
}
