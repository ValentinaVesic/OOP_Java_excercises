package Skola;

import java.util.ArrayList;

public class Student {

    String ime;
    ArrayList<Integer> ocene;

    public Student(String ime, ArrayList<Integer> ocene) {
        this.ime=ime;
        this.ocene=ocene;
    }

    public double prosek() {
        double suma=0;
        for(Integer o:ocene) {
            suma+=o;
        }
        return suma/ocene.size();
    }

    public void popravni() {
        if(prosek() < 1.5) {
            System.out.println("Morate na popravni!");
        } else {
            System.out.println("Ne morate na popravni!");
        }
    }

    public String toString() {
        return ime + " " + ocene;
    }

}