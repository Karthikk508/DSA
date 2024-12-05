import java.util.Arrays;

public class Binary_search_in_sorted_matrix {
    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };

        int target = 1;

        int[] a = search(arr,target);

        System.out.println(Arrays.toString(a));

    }
    public static int[] search(int[][] arr,int target) {
        int srow = 0;
        int erow = arr.length-1;

        int scolmn = 0;
        int ecolmn = arr[0].length-1;

        System.out.println(ecolmn);

        int cmid = ecolmn / 2;

        while (srow < erow-1 ) {
            int rmid = srow + (erow - srow) / 2;

            if (arr[rmid][cmid] == target) {
                return new int[]{rmid, cmid};
            } else if (target < arr[rmid][cmid]) {
                erow = rmid;
            } else if(target > arr[rmid][cmid]) {
                srow = rmid;
            }
            else{
                return new int[]{rmid, cmid};
            }
        }



        while (srow <= erow) {
            if (arr[srow][ecolmn] < target) {
                srow++;
            }

            int mid = scolmn + (ecolmn - scolmn) / 2;

            if(arr[srow][mid] == target)
            {
                return new int[]{srow,mid};
            }
            if (arr[srow][mid] < target) {
                scolmn = mid+1 ;
            } else if(arr[srow][mid] > target){

                ecolmn = mid;
            }
            else {
                return new int[]{scolmn,ecolmn};
            }
        }

        return new int[]{-1, -1};

    }

}
