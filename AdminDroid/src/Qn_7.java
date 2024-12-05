public class Qn_7 {

    // The provided block should be uploaded as is, and only the admindroidMain function needs to be converted to Java.
        public static void main(String[] args) {
            int[][] inputArray1 = {
                    {30, 17, 20, 25, 36},
                    {29, 13, 32, 10, 21},
                    {38, 8, 8, 30, 8},
                    {5, 36, 21, 20, 26},
                    {17, 16, 5, 24, 7}
            };
            int[] outputArray1 = {5, 16, 5, 38, 29, 17, 20, 25, 21, 8, 26, 24};
            validateTestCase(1, 5, inputArray1, outputArray1);

            int[][] inputArray2 = {
                    {16, 9, 14, 2},
                    {3, 6, 20, 21},
                    {8, 17, 7, 19},
                    {7, 12, 2, 5}
            };
            int[] outputArray2 = {2, 12, 8, 3, 9, 14, 21, 19};
            validateTestCase(2, 4, inputArray2, outputArray2);

            int[][] inputArray3 = {
                    {8, 3, 6},
                    {3, 8, 10},
                    {4, 2, 9}
            };
            int[] outputArray3 = {2, 3, 3, 10};
            validateTestCase(3, 3, inputArray3, outputArray3);
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

        static void printArray(int[] arr) {
            for (int val : arr) {
                System.out.printf("%5d", val);
            }
            System.out.println("\n\n\n");
        }

        static void validateTestCase(int testCaseId, int size, int[][] inputArr, int[] expectedOutputArr) {
            int[] resultArr = new int[4 * (size - 2)];
            System.out.println("Test Case " + testCaseId + " : \n\n");
            System.out.println("Input Array : \n\n");
            printArray(inputArr);
            admindroidMain(size, inputArr, resultArr);
            System.out.println("Output Array : \n\n");
            printArray(resultArr);
            if (areArraysEqual(resultArr, expectedOutputArr)) {
                System.out.println("Result : Test Case " + testCaseId + " Passed\n\n");
            } else {
                System.out.println("Result : Test Case " + testCaseId + " Failed\n\n");
            }
        }

        static boolean areArraysEqual(int[] array1, int[] array2) {
            if (array1.length != array2.length) {
                return false;
            }
            for (int i = 0; i < array1.length; ++i) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }

        // UPLOAD THE PROVIDED BLOCK WITH THE admindroidMain FUNCTION DEFINITION AS IS

        /* UPLOAD THIS BLOCK ONLY - STARTS */

    /*
    Name: Karthikeyan K
    Mobile Number: 9345273383
    Discord Name: karthikeyank_90031
    College: Government College of Engineering,Salem
    Dept: Electrical and Electronics Engineering
    */

        void sampleFunctionJustToShowYou() {
            // Function definitions can be added here.
        }

        public static void admindroidMain(int size, int[][] inputArr, int[] resultArr) {
            // Convert your logic here.

            int[] mat = new int[(size - 2) * 4];
            int k = 0;

            for (int i = 1; i < size - 1; i++) {
                mat[k++] = inputArr[0][i];
            }

            for (int i = 1; i < size - 1; i++) {
                mat[k++] = inputArr[i][size - 1];
            }

            for (int i = size - 2; i >= 1; i--) {
                mat[k++] = inputArr[size - 1][i];
            }

            for (int i = size - 2; i >= 1; i--) {
                mat[k++] = inputArr[i][0];
            }

            int min = mat[0], min_i = 0;
            for (int i = 1; i < mat.length; i++) {
                if (mat[i] < min) {
                    if (mat[i] == min) {
                        continue;
                    }
                    min = mat[i];
                    min_i = i;
                }
            }

            for (int i = 0; i < mat.length; i++) {
                resultArr[i] = mat[min_i++];
                if (min_i == mat.length) {
                    min_i = 0;
                }
            }
        }

        /* UPLOAD THIS BLOCK ONLY - ENDS */
    }

