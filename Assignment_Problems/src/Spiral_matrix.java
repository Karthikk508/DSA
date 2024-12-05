import java.util.ArrayList;
import java.util.List;
public class Spiral_matrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int rowsize = matrix.length-1;
        int colsize = matrix[0].length-1;
        List<Integer> list = new ArrayList<Integer> ();

        int row = 0;

        for(int col=0; col<=colsize; col++)
        {
            list.add(matrix[row][col]);
            if(col == colsize)
            {
                for(int i=row+1; i<=colsize; i++)
                {
                    list.add(matrix[i][col]);
                    if(i==rowsize)
                    {
                        for(int j=i-1; j>=0; j--)
                        {
                            list.add(matrix[i][j]);
                            if(j==0)
                            {
                                for(int l=0; l<colsize; l++)
                                {
                                    list.add(matrix[i-1][l]);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(list);
    }
    }

