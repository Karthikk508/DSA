package com.karthik.Static_example;

public class Static {
    static class Test{

        static String name ;

        public Test(String s)
        {
            this.name = s;
        }

    }
    public static void main(String[] args) {

        Test a = new Test("karthik");
        Test b = new Test("santhosh");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
