package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_25 {

    // Find the factor and sort according to that

    public static void main(String[] args) {

        int[] arr = {5,11,10,20,9,16,23};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){

        int size = arr.length;
        int[][] map = new int[2][100];

        for (int i = 0; i <arr.length; i++) {
            map[0][i] = arr[i];
            map[1][i] = findFactor(arr[i]);
        }

        sortAccToFreq(size,map);

        System.arraycopy(map[0], 0, arr, 0, size);

        System.out.println(Arrays.deepToString(map));
    }

    private static void sortAccToFreq(int size,int[][] map) {


        for (int i = 0; i < size; i++) {

            for (int j = 1; j < size - i; j++) {

                if(map[1][j] > map[1][j-1]){
                    int temp = map[1][j];
                    map[1][j] = map[1][j-1];
                    map[1][j-1] = temp;

                    temp = map[0][j];
                    map[0][j] = map[0][j-1];
                    map[0][j-1] = temp;
                }
            }
        }
    }
    public static int findFactor(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }
}
















//    public static void bubbleSort(int[] arr){
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if(arr[j] > arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
