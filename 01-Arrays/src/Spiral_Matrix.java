import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Spiral_Matrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return list;

        int top = 0;
        int bottom = matrix.length - 1; // rowsize
        int left = 0;
        int right = matrix[0].length - 1; // colsize

        while (true) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[left][i]);
            }
            top++;
            if (left > right || top > bottom)
                break;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (left > right || top > bottom)
                break;

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (left > right || top > bottom)
                break;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right || top > bottom)
                break;
        }
        System.out.println(list);
        return list;

    }
}
