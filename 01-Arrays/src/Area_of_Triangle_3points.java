public class Area_of_Triangle_3points {
    public static void main(String[] args) {

        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        double ans = area(points);
        System.out.println(ans);
    }
    public static double area(int[][] points)
    {
        double res = 0;
        for (int[] i: points)
            for (int[] j: points)
                for (int[] k: points)  // Formula for 3 points = (1/2) |x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)|.
                    res =  0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]);
        return res;
    }

}
