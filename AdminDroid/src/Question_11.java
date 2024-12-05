import java.util.Arrays;

public class Question_11 {

    public static void main(String[] args) {
//        int[][] inputArray1 = {
//                {30, 17, 20, 25, 36},
//                {29, 13, 32, 10, 21},
//                {38,  8,  8, 30,  8},
//                { 5, 36, 21, 20, 26},
//                {17, 16,  5, 24,  7}
//        };
//        int[][] outputArray1 = {
//                {17,  5, 38, 29, 30},
//                {16, 13, 32, 10, 17},
//                {5,  8,  8, 30, 24},
//                {20, 36, 21, 20,  7},
//                {25, 36, 21,  8, 26}
//        };
//        validateTestCase(1, 5, inputArray1, outputArray1);
        int[][] inputArray2 = {
                {16,  9, 14,  2},
                { 3,  6, 20, 21},
                { 8, 17,  7, 19},
                { 7, 12,  2,  5}
        };
        int[][] outputArray2 = {
                {14,  9, 16,  3},
                {12,  6, 20,  8},
                {2, 17,  7,  7},
                {5, 19, 21,  2}
        };
        validateTestCase(2, 4, inputArray2, outputArray2);
//        int[][] inputArray3 = {
//                { 8,  3,  6},
//                { 3,  8, 10},
//                { 4,  2,  9}
//        };
//        int[][] outputArray3 = {
//                { 4,  3,  8},
//                { 2,  8,  9},
//                { 3,  6, 10}
//        };
//        validateTestCase(3, 3, inputArray3, outputArray3);
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
        System.out.printf("Test Case %d :%n%n", testCaseId);
        System.out.println("Input Array :%n%n");
        printArray(size, size, inputArr);
        admindroidMain(size, inputArr);
        System.out.println("Output Array :%n%n");
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
                    return 0;
        return 1;
    }
    static void reverse(int[][] arr, int row, int size) {
        int start = 1, end = size - 2;
        while (start <= end) {
            int temp = arr[row][start];
            arr[row][start] = arr[row][end];
            arr[row][end] = temp;
            start++;
            end--;
        }

    }


    static void admindroidMain(int size, int[][] arr) {

        for(int i=1; i<size; i++)
        {
            int temp = arr[0][i];
            arr[0][i] = arr[i][0];
            arr[i][0] = temp;
        }
        for(int i=1; i<size-1; i++)
        {
            int temp = arr[i][size-1];
            arr[i][size-1] = arr[size-1][i];
            arr[size-1][i] = temp;
        }
        reverse(arr,0,size);
        reverse(arr,size-1,size);

        for(int i=0; i<size; i++)
        {
            int temp = arr[i][0];
            arr[i][0] = arr[i][size-1];
            arr[i][size-1] = temp;
        }

        //Finding minimum value

        int min = arr[0][0] , minr1 = 0 ,minc1 = 0 , c1 = 0 , r1 = 0;

        for(int i=0; i<size; i++)
        {
            if(min == arr[0][i])
            {
                continue;
            }
            if(arr[0][i]<min)
            {
                min = arr[0][i];
                r1 = 0;
                c1 = i-1;

            }
        }
        for(int i=1; i<size; i++)
        {
            if(min == arr[i][size-1])
            {
                continue;
            }
            if(arr[i][size-1]<min)
            {
                min = arr[i][size-1];
                r1 = i-1;
                c1 = size-1;

            }
        }
        for(int i=size-2; i>=0; i--)
        {
            if(min == arr[size-1][i])
            {
                continue;
            }
            if(arr[size-1][i]<min)
            {
                min = arr[size-1][i];
                r1 = size-1;
                c1 = i+1;

            }
        }
        for(int i=size-2; i>0; i--)
        {
            if(min == arr[i][0])
            {
                continue;
            }
            if(arr[i][0]<min)
            {
                min = arr[i][0];
                r1 = i+1;
                c1 = 0;

            }
        }

        int n = ((size-1)*4)/2;
        int startr = r1 , startc = c1;

        for(int i=0; i<n-1; i++)
        {
            if(startc == size-1 && startr != 0)
            {
                startr--;
            }
            else if(startr == 0 && startc != 0)
            {
                startc--;
            }
            else if(startr == size-1 && startr != startc)
            {
                startc++;
            }
            else if(startc == 0)
            {
                startr++;
            }
        }

        System.out.println(startc);
        System.out.println(startr);
        System.out.println(r1);
        System.out.println(c1);


        int start_r = startr, start_c = startc , end_r = r1 , end_c = c1;

        System.out.println(end_c);
        System.out.println(end_r);
        System.out.println(start_r);
        System.out.println(start_c);


        int k = n/2;

        System.out.println(k);

        while(k>0)
        {
            int temp = arr[start_r][start_c];
            arr[start_r][start_c] = arr[end_r][end_c];
            arr[end_r][end_c] = temp;

            if(start_c == size-1 && start_r != 0)
            {
                start_r++;
            }
            else if(start_r == 0)
            {
                start_c++;
            }
            else if(start_r == size-1 && start_r != start_c)
            {
                start_c--;
            }
            else if(start_c == 0)
            {
                start_r--;
            }


            /////////////// End row

            if(end_c == size-1 && end_r != 0)
            {
                end_r--;
            }
            else if(end_r == 0 && end_c != 0)
            {
                end_c--;
            }
            else if(end_r == size-1 && end_r != end_c)
            {
                end_c++;
            }
            else if(end_c == 0)
            {
                end_r++;
            }
            k--;

        }

    }

}

//
//    int r = 0;
//    int startr = r1 , startc = c1;
//    int n = 3;
//        while(n>0)
//                {
//                int temp = arr[0][r];
//                arr[0][r] = arr[startr][startc];
//                arr[startr][startc] = temp;
//                r++;
//                if(startc == size-1)
//                {
//                startr--;
//                }
//                n--;
//                }



//    int temp = arr[0][r];
//        arr[0][r] = arr[startr][startc];
//                arr[startr][startc] = temp;
//                r++;

//
//    static int val(int[][] arr, int[] arr1, int size) {
//        int index = 0;
//        for (int i = 1; i < size; i++) {
//            arr[0][i] = arr1[index++];
//        }
//
//        for (int j = 1; j < size; j++) {
//            arr[j][size - 1] = arr1[index++];
//        }
//
//        for (int i = size - 2; i >= 0; i--) {
//            arr[size - 1][i] = arr1[index++];
//        }
//        for (int i = size - 2; i >= 0; i--) {
//            arr[i][0] = arr1[index++];
//        }
//        return 0;
//    }
//
//    static int boundary(int[][] arr, int[] arr1, int size) {
//        int index = 0;
//        for (int i = 1; i < size; i++) {
//            arr1[index++] = arr[0][i];
//        }
//
//        for (int j = 1; j < size; j++) {
//            arr1[index++] = arr[j][size - 1];
//        }
//
//        for (int i = size - 2; i >= 0; i--) {
//            arr1[index++] = arr[size - 1][i];
//        }
//        for (int i = size - 2; i >= 0; i--) {
//            arr1[index++] = arr[i][0];
//        }
//        return 0;
//    }

//
//    int[] arr1 = new int[(size - 1) * 4];
//    boundary(inputArr, arr1, size);
//
//    int min1, min2 = arr1[0];
//        for (int i = 0; i < (size - 1) * 4; i++) {
//        if (arr1[i] < min2) {
//        min2 = arr1[i];
//        min1 = i;
//        }
//        }
//        int[] arr2 = new int[(size - 1) * 4];
//        for (int i = 0; i < arr1.length; i++) {
//        arr2[i] = arr1[min1++];
//        if (min1 == arr1.length) {
//        min1 = 0;
//        }
//        }
//
//        int[] arr3 = new int[((size - 1) * 4) / 2];
//        int[] arr4 = new int[((size - 1) * 4) / 2];
//        int j = 0;
//
//        for (int i = 0; i < ((size - 1) * 4) / 2; i++) {
//        arr3[i] = arr2[i];
//        j = i;
//        }
//        j++;
//
//        for (int i = 0; i < ((size - 1) * 4) / 2; i++) {
//        arr4[i] = arr2[j++];
//        }
//        int x = 0, y = arr4.length - 1;
//        while (x < y) {
//        int temp = arr4[x];
//        arr4[x] = arr4[y];
//        arr4[y] = temp;
//        x++;
//        y--;
//        }
//
//        int index = 0;
//        int k = min1 + size - 1;
//
//        for (index = 0; index < (size - 1) * 2; index++) {
//        if (k == (size - 1) * 4)
//        k = 0;
//
//        arr1[k] = arr3[index];
//        k++;
//        }
//        for (int index = 0; index < (size - 1) * 2; index++) {
//        if (k == (size - 1) * 4)
//        k = 0;
//        arr1[k] = arr4[index];
//        k++;
//        }
//        val(inputArr, arr1, size);
//        }


//
//  while(n>0)
//          {
//          if(startc == size-1)
//          {
//          startr--;
//          if(startr == 0) startc = size-2;
//          }
//          if(startr == size-1)
//          {
//
//          startc++;
//          if(startc == size-1) startr = size-2;
//          }
//          if(startc == 0)
//          {
//
//          startr++;
//          if(startr == size-1) ;
//
//          }
//          if (startr == 0)
//          {
//
//          startc--;
//          if(startr == 0) break;
//
//          }
//          n--;
//          }
//          System.out.println(startr);
//          System.out.println(startc);
//
//
//    int temp = arr[startr][startc];
//            arr[startr][startc] = arr[startc-startr][startr];
//                    arr[startc-startr][startr] = temp;