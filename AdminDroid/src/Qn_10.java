public class Qn_10 {

    public static void main(String[] args) {
        int[][] inputArray1 = {
                {20, 29, 12, 22, 8},
                {11, 7, 25, 6, 31},
                {25, 23, 5, 16, 27},
                {8, 22, 5, 25, 12},
                {27, 33, 27, 27, 15}
        };
        int[][] outputArray1 = {
                {20, 22, 11, 27, 8},
                {8, 7, 25, 6, 12},
                {29, 23, 5, 16, 27},
                {27, 22, 5, 25, 31},
                {27, 25, 12, 33, 15}
        };
        validateTestCase(1, 5, inputArray1, outputArray1);
//
//        int[][] inputArray2 = {
//                {1, 9, 14, 1},
//                {3, 6, 20, 21},
//                {8, 17, 7, 19},
//                {1, 12, 2, 1}
//        };
//        int[][] outputArray2 = {
//                {1, 8, 19, 1},
//                {14, 6, 20, 9},
//                {2, 17, 7, 12},
//                {1, 3, 21, 1}
//        };
//        validateTestCase(2, 4, inputArray2, outputArray2);
//
//        int[][] inputArray3 = {
//                {8, 3, 6},
//                {2, 8, 10},
//                {4, 2, 9}
//        };
//        int[][] outputArray3 = {
//                {8, 2, 6},
//                {10, 8, 2},
//                {4, 3, 9}
//        };
//        validateTestCase(3, 3, inputArray3, outputArray3);
//
//        int[][] inputArray4 = {
//                {0, 12, 13, 14, 15, 0},
//                {11, 8, 16, 23, 34, 16},
//                {10, 3, 3, 3, 9, 1},
//                {9, 3, 3, 3, 3, 2},
//                {8, 3, 3, 3, 3, 3},
//                {-3, 7, 6, 5, 4, -5}
//        };
//        int[][] outputArray4 = {
//                {0, 14, 11, 16, 13, 0},
//                {9, 8, 16, 23, 34, 2},
//                {12, 3, 3, 3, 9, 15},
//                {7, 3, 3, 3, 3, 4},
//                {10, 3, 3, 3, 3, 1},
//                {-3, 5, 8, 3, 6, -5}
//        };
//        validateTestCase(4, 6, inputArray4, outputArray4);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.printf("%6d", element);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void validateTestCase(int testCaseId, int size, int[][] inputArr, int[][] expectedOutputArr) {
        System.out.println("Test Case " + testCaseId + " : \n\n");
        System.out.println("Input Array : \n\n");
        printArray(inputArr);
        admindroidMain(size, inputArr);
        System.out.println("Output Array : \n\n");
        printArray(inputArr);
        if (areArraysEqual(size, inputArr, expectedOutputArr)) {
            System.out.println("Result : Test Case " + testCaseId + " Passed\n\n");
        } else {
            System.out.println("Result : Test Case " + testCaseId + " Failed\n\n");
        }
    }

    public static boolean areArraysEqual(int size, int[][] array1, int[][] array2) {
        for (int i = 0; i < size; ++i)
            for (int j = 0; j < size; ++j)
                if (array1[i][j] != array2[i][j])
                    return false;  // Arrays are not equal
        return true;
    }

    public static void swap(int[] arr, int size) {
        int ans = arr[0];
        for (int i = 2; i < size; i += 2) {
            int temp = arr[i];
            arr[i] = ans;
            ans = temp;
        }
        arr[0] = ans;

        ans = arr[size - 1];

        for (int i = size - 3; i >= 0; i -= 2) {
            int temp = arr[i];
            arr[i] = ans;
            ans = temp;
        }
        arr[size - 1] = ans;
    }

    public static void admindroidMain(int size, int[][] inputArr) {
        int[] mat = new int[(size - 2) * 4];
        int index = 0;
        for (int i = 1; i < size - 1; i++) {
            mat[index++] = inputArr[0][i];
        }
        for (int i = 1; i < size - 1; i++) {
            mat[index++] = inputArr[i][size - 1];
        }
        for (int i = size - 2; i >= 1; i--) {
            mat[index++] = inputArr[size - 1][i];
        }
        for (int i = size - 2; i >= 1; i--) {
            mat[index++] = inputArr[i][0];
        }

        int min = mat[0], min1 = 0, min2 = 0;
        for (int i = 1; i < mat.length; i++) {
            if (mat[i] < min) {
                if (mat[i] == min) {
                    continue;
                }
                min = mat[i];
                min1 = i;
                min2 = i;
            }
        }

        int[] arr2 = new int[(size - 2) * 4];

        for (int i = 0; i < mat.length; i++) {
            arr2[i] = mat[min1++];
            if (min1 == mat.length) {
                min1 = 0;
            }
        }

        swap(arr2, ((size - 2) * 4));
        int b = (arr2.length) - min2;

        int[] arr3 = new int[(size - 2) * 4];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2[b++];
            if (b == (arr3.length)) {
                b = 0;
            }
        }

        index = 0;
        for (int i = 1; i < size - 1; i++) {
            inputArr[0][i] = arr3[index++];
        }
        for (int i = 1; i < size - 1; i++) {
            inputArr[i][size - 1] = arr3[index++];
        }
        for (int i = size - 2; i >= 1; i--) {
            inputArr[size - 1][i] = arr3[index++];
        }
        for (int i = size - 2; i >= 1; i--) {
            inputArr[i][0] = arr3[index++];
        }
    }
}