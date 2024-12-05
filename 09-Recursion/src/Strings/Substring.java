package Strings;

public class Substring {

    public static void main(String[] args) {

        String str = "Welcometogeeksforgeeks";

        System.out.println(str.length());
        // using substring() to extract substring
        // returns (whiteSpace) geeksforgeeks

        System.out.print("The extracted substring is : ");
        System.out.println(str.substring(1, 20));
    }
}


