package PreviousQuestions;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {


    public static List<String> restore(String str){


        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=3 ; j++) {
                for (int k = 1; k <=3 ; k++) {
                    for (int l = 1; l <=3 ; l++) {

                        if(i+j+k+l == str.length()) {

                            int a = Integer.parseInt(str.substring(0, i));
                            int b = Integer.parseInt(str.substring(i, i + j));
                            int c = Integer.parseInt(str.substring(i + j, i + j + k));
                            int d = Integer.parseInt(str.substring(i + j + k, i + j + k + l));

                            if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {

                                String temp = a + "." + b + "." + c + "." + d;

                                if (temp.length() == str.length() + 3) {
                                    list.add(temp);
                                }
                            }
                        }
                    }
                }
            }
        }
        //System.out.println(list);

        return list;


    }

    public static void main(String[] args) {

        System.out.println(restore("254652521"));

    }
}
