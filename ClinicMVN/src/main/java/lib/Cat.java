package lib;

import Clinic.Client;

public class Cat implements Pet {
    private String petName;

    public Cat(String name){
        this.petName = name;
    }

    @Override
    public String getPetName(){
        return this.petName;
    }

    @Override
    public String setName(String nameClient){
        String message = String.format("Input name of a pet of %s: ", nameClient);
        this.petName = ConsoleWorker.askWrite(message);
        return this.petName;
    }
}
