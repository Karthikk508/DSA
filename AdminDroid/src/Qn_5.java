import java.util.Arrays;

public class Qn_5 {

    public static void main(String[] args) {
        int[][] inputArray1 = {
                {5, 28, 31, 5, 9},
                {4, 5, 11, 9, 7},
                {3, 12, 1, -1, 45},
                {19, 3, 25, 0, 8},
                {5, 10, 14, 17, 21}
        };
        int[][] outputArray1 = {
                {21, 20, 20},
                {24, 0, 19},
                {10, 1, 21}
        };
        int[] outputWeightage1 = {8461, 136};
        validateTestCase(1, 5, inputArray1, outputArray1, outputWeightage1);

    }

    static void printArray(int rows, int cols, int[][] arr) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void validateTestCase(int testCaseId, int size, int[][] inputArr, int[][] expectedOutputArr, int[] expectedWeightage) {
        int[][] outputArr = new int[size - 2][size - 2]; // { border weight, core weight }
        int[] outputWeightage = new int[2];
        System.out.println("\nTest Case " + testCaseId + " : \n");
        System.out.println("Input Array : \n\n");
        printArray(size, size, inputArr);
        admindroidMain(size, inputArr, outputArr, outputWeightage);
        System.out.println("Actual core weightage: " + outputWeightage[0]);
        System.out.println("Weightage after modulo dividing the core: " + outputWeightage[1]);
        System.out.println("Core Array : \n\n");
        printArray(size - 2, size - 2, outputArr);
        if (areArraysEqual(1, 2, outputArr, expectedOutputArr) == 1 && outputWeightage[0] == expectedWeightage[0] && outputWeightage[1] == expectedWeightage[1])
            System.out.println("Result : Test Case " + testCaseId + " Passed\n\n");
        else
            System.out.println("Result : Test Case " + testCaseId + " Failed\n\n");
    }

    static int areArraysEqual(int rows, int cols, int[][] array1, int[][] array2) {
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                if (array1[i][j] != array2[i][j])
                    return 0;  // Arrays are not equal
        return 1;
    }

    static int minval(int i, int j, int k, int l) {
        int min = i;
        if (j < min) {
            min = j;
        }
        if (k < min) {
            min = k;
        }
        if (l < min) {
            min = l;
        }
        return min;
    }

    static void admindroidMain(int size, int[][] inputArr, int[][] coreArray, int[] coreWeightage) {
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                int top = i, bottom = size - i - 1, left = j, right = size - j - 1;
                int min = minval(top, bottom, right, left);
                int total = 0;
                for (int a = i - min; a <= i + min; a++) {
                    for (int b = j - min; b <= j + min; b++) {
                        total += inputArr[a][b];
                    }
                }
                int total_sum = 0;
                for (int a = 0; a < size; a++) {
                    for (int b = 0; b < size; b++) {
                        total_sum += inputArr[a][b];
                    }
                }
                total_sum = total_sum - total;
                inputArr[i][j] = total_sum;
            }
        }

        int core_sum = 0, modified_coresum = 0;
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                core_sum += inputArr[i][j];
            }
        }
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                modified_coresum += (inputArr[i][j] % (size * size));
                coreArray[i - 1][j - 1] = (inputArr[i][j] % (size * size));
            }
        }

        coreWeightage[0] = core_sum;
        coreWeightage[1] = modified_coresum;
    }
}
