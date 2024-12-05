public class Question_11_A{

    public static void main(String[] args) {
        int[][] inputArray1 = {
                {30, 17, 20, 25, 36},
                {29, 13, 32, 10, 21},
                {38,  8,  8, 30,  8},
                { 5, 36, 21, 20, 26},
                {17, 16,  5, 24,  7}
        };
        int[][] outputArray1 = {
                {17,  5, 38, 29, 30},
                {16, 13, 32, 10, 17},
                { 5,  8,  8, 30, 24},
                {20, 36, 21, 20,  7},
                {25, 36, 21,  8, 26}
        };
        validateTestCase(1, 5, inputArray1, outputArray1);

        int[][] inputArray2 = {
                {16,  9, 14,  2},
                { 3,  6, 20, 21},
                { 8, 17,  7, 19},
                { 7, 12,  2,  5}
        };
        int[][] outputArray2 = {
                {14,  9, 16,  3},
                {12,  6, 20,  8},
                { 2, 17,  7,  7},
                { 5, 19, 21,  2}
        };
        validateTestCase(2, 4, inputArray2, outputArray2);

        int[][] inputArray3 = {
                { 8,  3,  6},
                { 3,  8, 10},
                { 4,  2,  9}
        };
        int[][] outputArray3 = {
                { 4,  3,  8},
                { 2,  8,  9},
                { 3,  6, 10}
        };
        validateTestCase(3, 3, inputArray3, outputArray3);

        int[][] inputArray4 = {
                {20, 29, 12, 22, 8},
                {11, 7, 25, 6, 31},
                {18, 23, 1, 16, 27},
                {8, 22, 5, 25, 3},
                {27, 33, 25, 27, 15}
        };
        int[][] outputArray4 = {
                {27, 8, 18, 27, 31},
                {33, 7, 25, 6, 8},
                {25, 23, 1, 16, 22},
                {27, 22, 5, 25, 12},
                {15, 3, 11, 20, 29}
        };
        validateTestCase(4, 5, inputArray4, outputArray4);
    }

    static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%6d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void validateTestCase(int testCaseId, int size, int[][] inputArr, int[][] expectedOutputArr) {
        System.out.printf("Test Case %d :%n%n", testCaseId);
        System.out.println("Input Array :%n%n");
        printArray(inputArr);
        admindroidMain(size, inputArr);
        System.out.println("Output Array :%n%n");
        printArray(inputArr);
        if (areArraysEqual(size, size, inputArr, expectedOutputArr) == 1)
            System.out.printf("Result : Test Case %d Passed%n%n", testCaseId);
        else
            System.out.printf("Result : Test Case %d Failed%n%n", testCaseId);
    }

    static int areArraysEqual(int rows, int cols, int[][] array1, int[][] array2) {
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                if (array1[i][j] != array2[i][j])
                    return 0;  // Arrays are not equal
        return 1;
    }

    static void val(int[][] arr, int[] arr1, int size) {
        int index = 0;
        for (int i = 1; i < size; i++) {
            arr[0][i] = arr1[index++];
        }

        for (int j = 1; j < size; j++) {
            arr[j][size - 1] = arr1[index++];
        }

        for (int i = size - 2; i >= 0; i--) {
            arr[size - 1][i] = arr1[index++];
        }
        for (int i = size - 2; i >= 0; i--) {
            arr[i][0] = arr1[index++];
        }
    }

    static void boundary(int[][] arr, int[] arr1, int size) {
        int index = 0;
        for (int i = 1; i < size; i++) {
            arr1[index++] = arr[0][i];
        }

        for (int j = 1; j < size; j++) {
            arr1[index++] = arr[j][size - 1];
        }

        for (int i = size - 2; i >= 0; i--) {
            arr1[index++] = arr[size - 1][i];
        }
        for (int i = size - 2; i >= 0; i--) {
            arr1[index++] = arr[i][0];
        }
    }

    static void admindroidMain(int size, int[][] inputArr) {

        int[] arr1 = new int[(size - 1) * 4];
        boundary(inputArr, arr1, size);

        int min1 = 0, min2 = arr1[0];
        for (int i = 0; i < (size - 1) * 4; i++) {
            if (arr1[i] < min2) {
                min2 = arr1[i];
                min1 = i;
            }
        }
        int[] arr2 = new int[(size - 1) * 4];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[min1++];
            if (min1 == arr1.length) {
                min1 = 0;
            }
        }

        int[] arr3 = new int[((size - 1) * 4) / 2];
        int[] arr4 = new int[((size - 1) * 4) / 2];
        int j = 0;

        for (int i = 0; i < ((size - 1) * 4) / 2; i++) {
            arr3[i] = arr2[i];
            j = i;
        }
        j++;

        for (int i = 0; i < ((size - 1) * 4) / 2; i++) {
            arr4[i] = arr2[j++];
        }
        int x = 0, y = arr4.length - 1;
        while (x < y) {
            int temp = arr4[x];
            arr4[x] = arr4[y];
            arr4[y] = temp;
            x++;
            y--;
        }


        int k = min1 + size - 1;

        for (int i = 0; i < (size - 1) * 2; i++) {
            if (k == (size - 1) * 4)
                k = 0;

            arr1[k] = arr3[i];
            k++;
        }
        for (int i = 0; i < (size - 1) * 2; i++) {
            if (k == (size - 1) * 4)
                k = 0;
            arr1[k] = arr4[i];
            k++;
        }
        val(inputArr, arr1, size);
    }
}
