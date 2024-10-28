package Knjiga;

import java.util.ArrayList;

public class Romanopisac extends Pisac {

    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    //dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.

    public void dugometrazniRoman() {
        for (Knjiga knjiga : getListaKnjiga()) {
            if (knjiga.getBrojStrana() > 500) {
                System.out.println("Ova knjiga ovog romanopisca je dugometrazni roman: " + knjiga.getNaslov());
            }
        }

    }
}