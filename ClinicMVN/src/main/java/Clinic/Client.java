package Clinic;
import lib.*;

public class Client {
    private String name;
    private Pet pet;

    public Client(String nameOfAClient, Pet pet){
        this.name = nameOfAClient;
        this.pet = pet;
    }

    public String getClientName() {
        return this.name;
    }
    public String setClientName(){
        ConsoleWorker.Write("Input new client name: ");
        this.name = ConsoleWorker.Read();
        return this.name;
    }
    public String setPetName(){
        return pet.setName(this.name);
    }
    public String getPetName(){return pet.getPetName();}

    public String showClient(){
        return "Client name: " + this.name + "\nPet name: " + this.pet.getPetName();
    }
}
