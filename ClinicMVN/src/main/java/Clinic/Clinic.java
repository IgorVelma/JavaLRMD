package Clinic;

import lib.*;

import javax.jws.soap.SOAPBinding;

public class Clinic {

    private Client[] clients;
    private int size;
    private int pos;

    public Clinic(final int sizeOfTheClinic) {
        this.size = sizeOfTheClinic;
        clients = new Client[this.size];
        this.pos = -1;
    }
    /**
     * Add client method without params
     * */
    private void addClient() {
        try {
            Client client = ConsoleWorker.newClient();
            if (pos == size) {
                ConsoleWorker.Write("The clinic is full!");
            } else {
                clients[++pos] = client;
            }
        }catch (UserExceptionHandle ex){
            ConsoleWorker.Write(ex.getMessage());
            ConsoleWorker.Write("A client not add in the clinic!");
        }
    }

    /**
     * with params for imitate a database
     * */
    public void addClient(Client client) {
        if (pos == size) {
            ConsoleWorker.Write("Clinic is full!");
        } else {
            clients[++pos] = client;
        }
    }

    private void deleteClient() {
        int i;
        int numberOfTheClient = ConsoleWorker.askClientNumber();
            if (pos < 0) {
                ConsoleWorker.Write("Clinic is empty!");
            } else {
                if (this.clients[numberOfTheClient - 1] != null) {
                    for (i = 0; i < this.size; ++i) {
                        if ((numberOfTheClient - 1) == (pos - 1)) {
                            ConsoleWorker.Write("Deleted!!");
                            break;
                        }
                    }
                    for (int j = i; j < this.size - 1; ++j) {
                        this.clients[j] = this.clients[j + 1];
                    }
                    --this.pos;
                }else{
                    ConsoleWorker.Write("No client to delete!");
                }
            }
    }

    private void renameClient() {
        showClients();
        boolean isRenamed = false;
        int position = ConsoleWorker.askClientNumber();
        while (!isRenamed) {
            try {
                for (int i = 0; i < size; ++i) {
                    if (i == (position - 1)) {
                        ConsoleWorker.Write("Client: " + clients[i].getClientName());
                        try {
                            clients[i].setClientName();
                            isRenamed = true;
                        }catch (UserExceptionHandle ex){
                            ConsoleWorker.Write(ex.getMessage());
                            isRenamed = false;
                        }
                    }
                }
            } catch (NullPointerException e) {
                ConsoleWorker.Write("Invalid number!");
            }
        }
    }

    private void renamePet() {
        showClients();
        boolean isRenamed = false;
        int position = ConsoleWorker.askClientNumber();
        while (!isRenamed) {
            try {
                for (int i = 0; i < size; ++i) {
                    if (i == (position - 1)) {
                        ConsoleWorker.Write("Pet: " + clients[i].getPetName());
                        try {
                            clients[i].setPetName();
                        }catch (UserExceptionHandle ex){
                            isRenamed = false;
                            ConsoleWorker.Write(ex.getMessage());
                        }
                        isRenamed = true;
                    }
                }
            } catch (NullPointerException e) {
                ConsoleWorker.Write("Invalid number!");
            }
        }
        ConsoleWorker.Write("Renamed!");
    }

    private void findClientOrPet() {
        boolean isFind = false;
        String name = ConsoleWorker.askWrite("Input who you want find: ");
        for (int i = 0; i < size; ++i) {
            if (clients[i] != null) {
                if (clients[i].getClientName().equals(name) || name.equals(clients[i].getPetName())) {
                    ConsoleWorker.Write("\t<INFO>\n"+clients[i].showClient());
                    isFind = true;
                }
            }
        }
        if (!isFind){
            ConsoleWorker.Write("Not found!");
        }
    }

    private void showClients() {
        int i = 1;
        ConsoleWorker.Write("Our clients: ");
        for (Client client : clients) {
            if (client != null) {
                ConsoleWorker.Write(i + ": " + client.showClient());
            }
            i++;
        }
    }

    public void clinicWork(ClinicOperations co){
        switch (co){
            case ADDCLIENT:
                addClient();
                break;
            case DELETECLIENT:
                deleteClient();
                break;
            case RENAMECLIENT:
                renameClient();
                break;
            case RENAMEPET:
                renamePet();
                break;
            case SHOW:
                showClients();
                break;
            case FIND:
                findClientOrPet();
                break;
            case EXIT:
                System.exit(1);
        }
    }
}
