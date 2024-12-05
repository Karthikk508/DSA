import java.util.Arrays;

public class Testing {

    public static void main(String[] args) {

        float orgsum = 16;
        int cursum = 4;

        float ans = orgsum%cursum;

        System.out.println(ans);

        System.out.println("true");

        int[] a ={1,2,3,4,5,6};

        for (int j : a) {
            int sum1 = 0;
            sum1 += j;
            System.out.println(sum1);
        }

        threeloop();

    }
    public static void threeloop()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.println("karthik");
                }
            }
        }
    }


    public static void flipAndInvertImage() {

            int[][] image = {{1,1},{1,0},{0,0},{1,2}};

            int row_size = image[0].length;
            int col_size = image.length;
        System.out.println(col_size);
        System.out.println(row_size);
            for(int i=0; i<=col_size; i++)
            {

                    int s = 0;
                    int e = row_size;
                    while(s<=e)
                    {
                        swap(image,i,s,e);
                        s++;
                        e--;
                    }
                    // if(image[i][j]==0) image[i][j] = 1;
                    // else image[i][j] = 0;
                }

        System.out.println(Arrays.toString(image));

    }
        public static void swap(int[][] arr,int i,int first, int second) {
            int temp = arr[i][first];
            arr[i][first] = arr[i][second];
            arr[i][second] = temp;
        }
    }

