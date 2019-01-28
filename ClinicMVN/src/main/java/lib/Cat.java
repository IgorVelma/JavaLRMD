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
    public String setName(String nameClient) throws UserExceptionHandle{
        String message = String.format("Input name of a pet of %s: ", nameClient);
        String tmpPetName = ConsoleWorker.askWrite(message);
        if(this.petName.length()<1){
            throw new UserExceptionHandle("A name length need to be > 1");
        }else{
            this.petName = tmpPetName;
            ConsoleWorker.Write("Renamed!");
        }
        return this.petName;
    }
}
