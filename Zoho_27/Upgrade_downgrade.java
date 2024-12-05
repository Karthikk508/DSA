import java.util.Locale;

public class Upgrade_downgrade {

    public static void main(String[] args) {

        String version1 = "1.01.15";
        String version2 = "9.0.24";
        check(version1,version2);

    }
    public static void check(String ver1 , String ver2)
    {
        int ver_1 = 0 ,ver_2 = 0;
        int ans1 = 0;
        for (int i = 0; i < ver1.length(); i++) {

            if(ver1.charAt(i) != '.')
            {
                ver_1 += ver1.charAt(i) - '0';
                ver_1 *= 10;
            }
        }
        System.out.println(ver_1);
        for (int i = 0; i < ver2.length(); i++) {

            if(ver2.charAt(i) != '.')
            {
                ver_2 += ver1.charAt(i) - '0';
                ver_2 *= 10;
            }
        }

    }

}
