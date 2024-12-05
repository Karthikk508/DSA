package main;

public class Test2 {

    public static void main(String[] args) {

        pattern(3,3);

    }

    public static void pattern(int n,int m) {


        int top = 0 , bottom = n;
        int left = 0, right = m;
        int count = 0;


        while(top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if (count % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
            top++;
            for (int i = top; i <= bottom; i++) {

                for (int j = left; j <right ; j++) {
                    System.out.print(" ");
                }
                if (count % 2 == 0) {
                    System.out.println("X");
                } else {
                    System.out.println("O");
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (count % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print("O");
                    }
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (count % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print("O");
                    }
                }
            }
            left++;

            count++;
        }

    }
}
