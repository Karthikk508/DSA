package String;

class Rotate_string{

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s,goal));




    }
    public static boolean rotateString(String s, String goal) {


        for(int i = 0; i<s.length(); i++)
        {
            String temp = "";

            temp += s.substring(((s.length()-1)-i),s.length());

            temp += s.substring(0,((s.length())-(i+1)));

            if(temp.equals(goal))
            {
                return true;
            }
        }
        return false;

    }
}