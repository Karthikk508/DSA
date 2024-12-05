package main;

// filename Main.java
public class Point {
    protected int x, y;

    public void Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
    public static void main(String args[])
    {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
