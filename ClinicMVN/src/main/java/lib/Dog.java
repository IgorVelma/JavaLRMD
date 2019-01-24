package lib;

public class Dog implements Pet {

    private String name;

    public Dog(String nameOfADog){
        this.name = nameOfADog;
    }


    public String getPetName(){
        return this.name;
    }
    public String setName(String nameClient){
        String message = String.format("Input name of a pet of %s: ", nameClient);
        this.name = ConsoleWorker.askWrite(message);
        return this.name;
    }

}
