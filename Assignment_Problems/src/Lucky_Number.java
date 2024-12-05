import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Lucky_Number {
    public static void main(String[] args) {

        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};

        List<Integer> res = new ArrayList<>();

        for(int row=0; row<matrix.length; row++)
        {
            int min = matrix[row][0];
            for(int col=0; col<matrix[0].length; col++)
            {
                if(min > matrix[row][col])
                {
                    min = matrix[row][col];
                }
            }
            int max = 0;
            for(int col1=0; col1<matrix.length; col1++)
            {

                if(max<matrix[col1][row])
                    max=matrix[col1][row];
            }
            if(min==max) res.add(min);

        }


        System.out.println(res);
    }
}
