package org.example;
public class Car {
    IEngine engine;

    public Car() {
        System.out.println("Car class constructor...");
    }

    public void setEngine(IEngine engine)
    {
        this.engine = engine;
    }

    public void drive(){
        int start = engine.start();
        if(start > 0){
            System.out.println("Car started...");
        }
        else {
            System.out.println("Car not started...");
        }
    }
}
