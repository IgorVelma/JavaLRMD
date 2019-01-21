package Clinic;
import static java.lang.Math.*;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Cat implements Pet {
    private String name;
    private int day, month, year;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String GetName() {
        return name;
    }
    @Override
    public  String SetName(){
        Scanner scan = new Scanner(System.in);
        String nameOfThePet;
        System.out.println("Input name of the pet: ");
        nameOfThePet = scan.nextLine();
        this.name = nameOfThePet;
        return this.name;
    }
    @Override
    public void setDate(){
        Calendar now = Calendar.getInstance();
        this.year = abs(now.get(Calendar.YEAR) - this.year);
        this.month = abs(now.get(Calendar.MONTH) - this.month);
        this.day = abs(now.get(Calendar.DATE)- this.day);
    }
    @Override
    public String getDate(){
        return  year +" years. "+month+" months. "+ day+" days.";
    }
}
