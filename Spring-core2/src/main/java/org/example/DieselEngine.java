package org.example;
public class DieselEngine implements IEngine{

    public DieselEngine() {
        System.out.println("DieselEngine constructor...");
    }

    public int start(){
        System.out.println("DieselEngine started...");
        return 1;
    }
}
