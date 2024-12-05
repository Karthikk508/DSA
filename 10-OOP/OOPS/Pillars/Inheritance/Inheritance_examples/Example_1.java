package OOPS.Pillars.Inheritance.Inheritance_examples;


class Bicycle {

    public int gear;
    public int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}


class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear,int speed,int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}


public class Example_1 {

    public static void main(String[] args)
    {

        Bicycle bike =  new Bicycle(5,200);
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        mb.applyBrake(10);
        System.out.println(mb.speed);
        System.out.println("Gear = " + bike.gear + " " + "\nSpeed of bicycle = "+ bike.speed);
    }
}
