package com.karthik.Singleton;

public class Singleton {

    private int name;

    private Singleton()
    {

    }

    private static Singleton instance;

    public static Singleton getinstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
            System.out.println("Object created");
        }

        return instance;
    }

}
