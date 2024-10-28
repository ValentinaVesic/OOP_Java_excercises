package Knjiga;

import java.util.ArrayList;

public class Esejista extends Pisac{
    public Esejista(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    //kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.*/

    public int kratkiEseji() {
        int brojaEseja = 0;
        for (Knjiga knjiga : getListaKnjiga()) {
            if (knjiga.getBrojStrana() < 50) {
                brojaEseja++;
            }
        }
        return brojaEseja;
    }
}
