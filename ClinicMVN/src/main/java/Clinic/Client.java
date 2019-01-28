package Clinic;
import lib.*;
import org.omg.CORBA.UserException;

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
    public String setClientName() throws UserExceptionHandle{
        ConsoleWorker.Write("Input new client name: ");
        String tmpClientName = ConsoleWorker.Read();
        if(tmpClientName.length()>1){
            this.name = tmpClientName;
            ConsoleWorker.Write("Renamed!");
        }else{
            throw new UserExceptionHandle("Name length need to be > 1");
        }
        return this.name;
    }
    public String setPetName() throws UserExceptionHandle{
        return pet.setName(this.name);
    }
    public String getPetName(){return pet.getPetName();}

    public String showClient(){
        return "Client name: " + this.name + "\nPet name: " + this.pet.getPetName();
    }
}
