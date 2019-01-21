package Clinic;


import java.util.Scanner;

public class Client
{

    private String id;
    private final Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
        pet.setDate();
    }
    public String  Bla(){
        return "Client name: " + this.id + " - Pet: '" + this.pet.GetName()+"' " + this.pet.getDate();
    }
    public String getPetName(){
        return this.pet.GetName();
    }
    public String getClientName(){
        return this.id;
    }
    public String setClientName(){
        Scanner scan = new Scanner(System.in);
        String nameOfTheClient;
        System.out.println("Input name of the client: ");
        nameOfTheClient = scan.nextLine();
        this.id = nameOfTheClient;
        return this.id;
    }
    public String setPetName(){
       return pet.SetName();
    }


}
