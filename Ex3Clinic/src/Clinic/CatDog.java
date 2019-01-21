package Clinic;

public class CatDog extends Animal {
    Pet cat;
    Pet dog;

    public CatDog(Pet cat, Pet dog){
        this.cat = cat;
        this.dog = dog;
    }

    public String GetName(){
        return name;
    }
}
