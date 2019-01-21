package Clinic;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Clinic {
    private final Client[] clients;
    private int size;
    private int pos;

    public Clinic(int size) {
        this.size = size;
        this.clients = new Client[size];
        pos = -1;
    }

    public void addClient(final Client client) {
        if (pos == size) {
            System.out.println("Clinic full!");
        } else {
            //this.pos++;
            this.clients[++this.pos] = client;
            //System.out.println("pos: " + pos);
        }
    }
    public void findPet(String nameOfTheClient) {
        for (int i = 0; i < size; ++i) {
            if (this.clients[i] != null) {
                if (clients[i].getClientName().contains(nameOfTheClient)) {
                    System.out.println("The client "+clients[i].getClientName() + " have the pet: '" + clients[i].getPetName()+"'\n");
                }
            }
        }
    }
    /**
     * сделать счетчик перевода из даты рождения в 2 года 3 меяца
     * ******************************/
    public void findClient(String nameOfThePet){
        for(int i=0; i<size; ++i){
            if(this.clients[i]!=null){
                if(clients[i].getPetName().contains(nameOfThePet)){
                    System.out.println("Pet: " + clients[i].getPetName() + " have client: " + clients[i].getClientName());
                }
            }
        }
    }
    public void editPet(final int pos){
        System.out.println("New name of the pet of: "+clients[pos-1].getClientName());
        clients[pos-1].setPetName();
        System.out.println("Edited successfully!!");
    }
    public void editClient(final int pos){
        System.out.println("New name of the client: " + clients[pos-1].getClientName());
        clients[pos-1].setClientName();
        System.out.println("Edited successfully!!");
    }

    public void deleteClient(final int pos) {
        int i;
        if (pos < 0) {
            System.out.println("No Clients");
        } else {
            for (i = 0; i < size; i++) {
                if (i == (pos - 1)) {
                    //this.clients[pos] = null;
                    break;
                }
            }
            for (int j = i; j < size - 1; j++) {
                this.clients[j] = this.clients[j + 1];
            }
            this.pos--;
        }
    }

    public void showClients() {
        System.out.println("Our clients: ");
        for (int i = 0; i < size; ++i) {
            if (this.clients[i] != null) {
                System.out.println((i + 1) + " " + this.clients[i].Bla());
            }
        }
        System.out.println("\n");
    }
}
