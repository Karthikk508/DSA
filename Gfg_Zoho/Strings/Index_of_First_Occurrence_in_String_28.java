package Strings;

public class Index_of_First_Occurrence_in_String_28  {

    public static int maxCharacterDistance(String str) {
        int freq = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                int temp = str.lastIndexOf(str.charAt(i)) - str.indexOf(str.charAt(i)) - 1;
                if (temp > freq) {
                    freq = temp;
                }
            }
        }
        return (freq != -1) ? freq : -1;
    }

    public static void main(String[] args) {

        String str = "examplestrimng";
        int result = maxCharacterDistance(str);
        System.out.println("Maximum character distance: " + result);
        System.out.println(str.indexOf(str.charAt(0)));
        System.out.println(str.lastIndexOf('m'));

    }
}

