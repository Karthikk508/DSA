package OOPS.Keywords.Super;


class Vehicle{
    int speed = 1000;
}

class Car extends Vehicle {


    void display()
    {
        System.out.println("Speed of the car is " + super.speed + "km/hr");
    }
}

public class Super_with_Variables {

    public static void main(String[] args) {

        Car car = new Car();
        car.display();
    }
}