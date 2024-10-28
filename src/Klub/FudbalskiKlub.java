package Klub;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String najboljiStrelac() {
        Igrac najbolji = getListaIgraca().get(0);

        for (Igrac i : getListaIgraca()) {
            if (i.getBrojPostignutihpoena() > najbolji.getBrojPostignutihpoena()) {
                najbolji = i;
            }
        }
        return najbolji.getIme();


    }

    @Override
    public void vrednosttima() {
        int vrednost = 0;
        for (Igrac i : getListaIgraca()) {
            vrednost = i.getBrojPostignutihpoena() * 1000;
        }
        System.out.println("Vrednost tima je " + (vrednost * getListaIgraca().size()));
    }
}
