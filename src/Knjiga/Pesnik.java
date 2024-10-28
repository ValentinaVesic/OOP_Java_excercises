package Knjiga;

import java.util.ArrayList;

public class Pesnik extends Pisac{
    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    //brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).


    public int brojZbirki() {
        int brojacZbirki = 0;
        for (Knjiga knjiga : getListaKnjiga()) {
            if (knjiga.getBrojStrana() < 100) {
                brojacZbirki++;
            }
        }
        return brojacZbirki;
    }
}
