package Clinic;

import lib.*;

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
        Client client = ConsoleWorker.newClient();
        if (pos == size) {
            ConsoleWorker.Write("Clinic is full!");
        } else {
            clients[++pos] = client;
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
            for (i = 0; i < this.size; ++i) {
                if ((numberOfTheClient-1) == (pos - 1)) {
                    break;
                }
            }
            for (int j = i; j < this.size - 1; ++j) {
                this.clients[j] = this.clients[j + 1];
            }
            --this.pos;
        }
        ConsoleWorker.Write("Deleted!!");
    }

    private void renameClient() {
        showClients();
        boolean isRenamed = false;
        while (!isRenamed) {
            try {
                int position = ConsoleWorker.askClientNumber();
                for (int i = 0; i < size; ++i) {
                    if (i == (position - 1)) {
                        ConsoleWorker.Write("Client: " + clients[i].getClientName());
                        clients[i].setClientName();
                        ConsoleWorker.Write("Renamed!");
                        isRenamed = true;
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
        while (!isRenamed) {
            try {
                int position = ConsoleWorker.askClientNumber();
                for (int i = 0; i < size; ++i) {
                    if (i == (position - 1)) {
                        ConsoleWorker.Write("Pet: " + clients[i].getPetName());
                        clients[i].setPetName();
                        ConsoleWorker.Write("Renamed!");
                        isRenamed = true;
                    }
                }
            } catch (NullPointerException e) {
                ConsoleWorker.Write("Invalid number!");
            }
        }
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
