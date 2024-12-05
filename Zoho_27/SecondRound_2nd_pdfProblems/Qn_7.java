package SecondRound_2nd_pdfProblems;

public class Qn_7 {

    // Version upgrade and downgrade


    public static void main(String[] args) {

        String version1 = "1.6";
        String version2 = "1.6.0.0";


        System.out.println(findVersion(version1,version2));



    }

    public static int findVersion(String ver1,String ver2)
    {
        int i = 0 , j = 0 , n = ver1.length() , m = ver2.length();

        while(i < n || j < m)
        {
            int temp1 = 0;
            while(i < n && ver1.charAt(i) != '.')
            {
                temp1 = (temp1 * 10 ) + (ver1.charAt(i) - '0');
                i++;
            }

            int temp2 = 0;
            while(j < m && ver2.charAt(j) != '.')
            {
                temp2 = (temp2 * 10 ) + (ver2.charAt(j) - '0');
                j++;
            }

            if(temp1 < temp2)
            {
                return -1;
            }
            else if(temp1 > temp2)
            {
                return 1;
            }
            i++;
            j++;
        }

        return 0;

    }
}
