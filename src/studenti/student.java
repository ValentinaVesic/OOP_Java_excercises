package studenti;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class student {
    /*Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.*/
    String ime;
    ArrayList<Integer> listaOcena;

    public student(String ime, ArrayList<Integer> listaOcena){
        this.ime = ime;
        this.listaOcena=listaOcena;
    }

    public double prosek(ArrayList<Integer> listaOcena){
        double prosek;
        int zbir =0;
        for (int i = 0; i<listaOcena.size(); i++){
 //           zbir += listaOcena[i];
        }

        return zbir / listaOcena.size();
        
    }

    public String toString() {
        return "Ime studenta je " + ime + ", a njegove ocene su " + (listaOcena);
    }

}
