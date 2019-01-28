package lib;

public class Dog implements Pet {

    private String petName;

    public Dog(String nameOfADog){
        this.petName = nameOfADog;
    }


    public String getPetName(){
        return this.petName;
    }

    @Override
    public String setName(String nameClient) throws UserExceptionHandle{
        String message = String.format("Input name of a pet of %s: ", nameClient);
        String tmpPetName = ConsoleWorker.askWrite(message);
        if(tmpPetName.length()>1){}else{
            throw new UserExceptionHandle("A name length need to be > 1");
        }
        this.petName = tmpPetName;
        return this.petName;
    }

}
