package Clinic;
import static java.lang.Math.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Dog implements Pet {
    private  String name;
    private int day, month, year;

    public Dog(String name, int day, int month, int year) {
        this.name = name;
        Calendar now = Calendar.getInstance();
        this.year = year;
        this.month = month;
        this.day = day;
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
//        int res = this.year*365 + this.month*30 + this.day;
//        int nowres = now.get(Calendar.YEAR)*365 + now.get(Calendar.MONTH)*30 + now.get(Calendar.DATE);
//        int result = Math.abs(res - nowres);
//        this.year = result/365;
//        this.month = (result/30)-result/30/12-now.get(Calendar.DATE);
//        this.day = now.get(Calendar.DATE)  - result/365 - (result/365)/30-2;
        String dayte = toStringInfo();
        String endDayte = toStringNow();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(dayte, formatter);
        LocalDate endDate = LocalDate.parse(endDayte, formatter);
        Period period = Period.between(startDate, endDate);
        this.day = period.getDays();
        this.month = period.getMonths();
        this.year = period.getYears();
    }

    private String toStringInfo(){
        return this.day+".0"+this.month+"."+this.year;
    }
    private String toStringNow(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.DATE)+".0" +(now.get(Calendar.MONTH)+1)+"."+ now.get(Calendar.YEAR);
    }
    @Override
    public String getDate(){
        return  year +" years. "+month+" months. "+ day+" days.";
    }
}
