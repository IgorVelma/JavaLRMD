package lib;

import Clinic.Client;
import Clinic.Clinic;

import java.util.Scanner;

public class ConsoleWorker {

    private static Scanner scan = new Scanner(System.in);


    public static void Write(String message) {
        System.out.println(message);
    }

    public static String Read() {
        return scan.next();
    }

    public static String askWrite(String message) {
        System.out.println(message);
        return scan.next();
    }

    public static int askClientNumber() {
        int clientNumber = 0;
        String symbol;
        boolean isRite = false;
        while (!isRite) {
            ConsoleWorker.Write("Input id of client: ");
            symbol = ConsoleWorker.Read();
            try {
                clientNumber = Integer.parseInt(symbol.substring(0, 1));
                isRite = symbol != String.valueOf(0) ;
            }catch (NumberFormatException e){
                ConsoleWorker.Write("Invalid number!!");
            }
        }
        return clientNumber;
    }

    /**
     * Block of methods of menu
     */
    public static ClinicOperations askOperation() {
        ClinicOperations operation = null;
        boolean isTrue = false;
        do {
            ConsoleWorker.Write("\t<<Clinic>>");
            ConsoleWorker.Write("1.Add new client.\n2.Delete client.\n" +
                    "3.Rename client.\n4.Rename pet.\n5.Find client.\n6.Show clients.\n7.Exit.\n");
            String choice = ConsoleWorker.askWrite("Your choice?: ");
            try {
                operation = ClinicOperations.getOperation(choice.charAt(0));
                isTrue = choice.length() == 1;
            } catch (UnsupportedOperationException ex) {
                ConsoleWorker.Write("Invalid choice!");
            }
        } while (!isTrue);

        return operation;
    }

    public static Client newClient() throws UserExceptionHandle {
        boolean isInvalid = true;
        String name;
        String nameOfAPet;
        Client client = null;
        while (isInvalid) {
            name = ConsoleWorker.askWrite("Input name of client: ");
            nameOfAPet = ConsoleWorker.askWrite("Input pet name: ");
            if (name.length() > 1 || nameOfAPet.length() > 1) {
            } else {
                isInvalid = true;
                throw new UserExceptionHandle("Name length need to be > 1");
            }
            while (isInvalid) {
                String pet = ConsoleWorker.askWrite("Cat or Dog?");
                if (pet.toLowerCase().equals("cat")) {
                    client = new Client(name, new Cat(nameOfAPet));
                    isInvalid = false;
                } else if (pet.toLowerCase().equals("dog")) {
                    client = new Client(name, new Dog(nameOfAPet));
                    isInvalid = false;
                } else {
                    ConsoleWorker.Write("Invalid input");
                    isInvalid = true;
                }
            }
        }
        return client;
    }
}
