package Set_3;

public class CompareVersion {

    public static void main(String[] args) {

        String ver1 = "1.01";
        String ver2 = "1.001";

        System.out.println(compare(ver1, ver2));
    }

    private static int compare(String ver1, String ver2) {

        int i = 0 , j = 0 ;

        int n = ver1.length();
        int m = ver2.length();

        while(i< n || j < m)
        {
            int temp1 = 0 ,temp2 = 0;

            while(i<n && ver1.charAt(i) != '.')
            {
                temp1 = temp1 * 10 + ver1.charAt(i) - '0';
                i++;
            }
            while(j<n && ver2.charAt(j) != '.')
            {
                temp2 = temp2 * 10 + ver2.charAt(j) - '0';
                j++;
            }

            if(temp1 > temp2)
            {
                return -1;
            }
            else if(temp1 < temp2)
            {
                return 1;
            }
            else {
                i++;
                j++;
            }
        }
        return 0;
    }
}
