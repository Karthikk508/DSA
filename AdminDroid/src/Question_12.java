public class Question_12 {

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
//            int[][] inputArray2 = {
//                    {1, 9, 14, 1},
//                    {3, 6, 20, 21},
//                    {8, 17, 7, 19},
//                    {1, 12, 2, 1}
//            };
//            int[][] outputArray2 = {
//                    {1, 8, 19, 1},
//                    {14, 6, 20, 9},
//                    {2, 17, 7, 12},
//                    {1, 3, 21, 1}
//            };
//            validateTestCase(2, 4, inputArray2, outputArray2);
//
//            int[][] inputArray3 = {
//                    {8, 3, 6},
//                    {2, 8, 10},
//                    {4, 2, 9}
//            };
//            int[][] outputArray3 = {
//                    {8, 2, 6},
//                    {10, 8, 2},
//                    {4, 3, 9}
//            };
//            validateTestCase(3, 3, inputArray3, outputArray3);
//
//            int[][] inputArray4 = {
//                    {0, 12, 13, 14, 15, 0},
//                    {11, 8, 16, 23, 34, 16},
//                    {10, 3, 3, 3, 9, 1},
//                    {9, 3, 3, 3, 3, 2},
//                    {8, 3, 3, 3, 3, 3},
//                    {-3, 7, 6, 5, 4, -5}
//            };
//            int[][] outputArray4 = {
//                    {0, 14, 11, 16, 13, 0},
//                    {9, 8, 16, 23, 34, 2},
//                    {12, 3, 3, 3, 9, 15},
//                    {7, 3, 3, 3, 3, 4},
//                    {10, 3, 3, 3, 3, 1},
//                    {-3, 5, 8, 3, 6, -5}
//            };
//            validateTestCase(4, 6, inputArray4, outputArray4);
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

        static void validateTestCase(int testCaseId, int size, int[][] inputArr, int[][] expectedOutputArr) {
            System.out.printf("Test Case %d : ", testCaseId);
            System.out.println("Input Array : ");
            printArray(size, size, inputArr);
            admindroidMain(size, inputArr);
            System.out.println("Output Array : ");
            printArray(size, size, inputArr);
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

           static void admindroidMain(int size, int[][] inputArr) {
            int a = 0, b = 0, min = 9999;

            int n = ((size - 2) * 4) / 2;

            for (int i = 1; i < size - 1; i++) {
                if (inputArr[0][i] < min) {
                    if (inputArr[0][i] == min) {
                        continue;
                    }
                    min = inputArr[0][i];
                    a = 0;
                    b = i;
                }
            }
            for (int i = 1; i < size - 1; i++) {
                if (inputArr[i][size - 1] < min) {
                    if (inputArr[i][size - 1] == min) {
                        continue;
                    }
                    min = inputArr[i][size - 1];
                    a = i;
                    b = size - 1;
                }
            }
            for (int i = size - 2; i >= 1; i--) {
                if (inputArr[size - 1][i] < min) {
                    if (inputArr[size - 1][i] == min) {
                        continue;
                    }
                    min = inputArr[size - 1][i];
                    a = size - 1;
                    b = i;
                }
            }
            for (int i = size - 2; i >= 1; i--) {
                if (inputArr[i][0] < min) {
                    if (inputArr[i][0] == min) {
                        continue;
                    }
                    min = inputArr[i][0];
                    a = i;
                    b = 0;
                }
            }

            System.out.println("Karthik" +min);

            int i = a, j = b;
            int count1 = n;
            int i1 = 0, i2 = 0, min1 = min, min2 = 0;

            while (count1 > 0) {//clockwise rotation
                int k = 0;
                while (k < 2) {   //2 times moving
                    if (j == 0) {
                        i--;
                        if (i == 0) j++;
                    }
                    else if (i == 0) {
                        j++;
                        if (j == size - 1) i++;
                    }
                    else if (i == size - 1) {
                        j--;
                        if (j == 0) i--;
                    }
                    else if (j == size - 1) {
                        i++;
                        if (i == size - 1) j--;
                    }
                    if (i1 == 0 && i2 == 0) //find the anticlockwise start index
                    {
                        i1 = i;
                        i2 = j;
                        min2 = inputArr[i1][i2];
                    }
                    k++;
                }
                int temp = inputArr[i][j];
                inputArr[i][j] = min1;
                min1 = temp;
                count1--;
            }
            int count2 = n;
            while (count2 > 0) {//anti-clockwise rotation
                int k = 0;
                while (k < 2)
                {                                   //2 times moving
                    if (i1 == 0)
                    {
                        i2--;
                        if (i2 == 0) i1++;
                    }
                    else if (i2 == 0)
                    {
                        i1++;
                        if (i1 == size - 1) i2++;
                    }
                    else if (i1 == size - 1)
                    {
                        i2++;
                        if (i2 == size - 1) i1--;
                    }
                    else if (i2 == size - 1)
                    {
                        i1--;
                        if (i1 == 0) i2--;
                    }
                    k++;
                }
                int temp = inputArr[i1][i2];
                inputArr[i1][i2] = min2;
                min2 = temp;
                count2--;
            }
        }
    }


