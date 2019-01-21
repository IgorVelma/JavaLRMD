import Clinic.*;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Cat("Dik");
        Pet [] pets = new Pet [5];
        pets[0] = cat;

        final Clinic clinic = new Clinic(10);
//        System.out.println("\nBeforeAdd");
//        clinic.showClients();
//        System.out.println("\nClose\n");
        clinic.addClient(new Client("Vika", new Cat("Kisa")));
        clinic.addClient(new Client("Dimon", cat));
        clinic.addClient(new Client("Somin", new Dog("Slim", 13,4, 2016)));
        //clinic.addClient(new Client("Petr", new CatDog(new Cat("Vasek"), new Dog("Dusek", 13,4, 2016))));
        clinic.showClients();
        System.out.println("\nAfter delete\n");
        clinic.deleteClient(1);
        clinic.showClients();
        clinic.addClient(new Client("Dimon", new Dog("Slic", 28, 7, 1997)));
        clinic.showClients();
        clinic.editPet(2);
        clinic.editClient(1);
        clinic.showClients();
        clinic.findPet("Somin");
        clinic.findClient("Dik");

    }
}
