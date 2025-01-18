package org.example;
public class PetrolEngine implements IEngine{

    public PetrolEngine() {
        System.out.println("PetrolEngine constructor...");
    }

    public int start(){
        System.out.println("PetrolEngine started...");
        return 1;
    }
}
