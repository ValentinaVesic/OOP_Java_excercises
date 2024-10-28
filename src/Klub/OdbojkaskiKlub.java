package Klub;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {
    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public void vrednosttima() {
        int vrednost = 0;
        for (Igrac i : getListaIgraca()) {
            vrednost = i.getBrojPostignutihpoena() * 100;
        }
        System.out.println("Vrednost tima je " + (vrednost * getListaIgraca().size()));
    }

   /*

   ZAO MI JE DEJANE ALI JA OVO NE RAZUMEM, PA NEK BUDE DA NISAM URADILA OVU METODU



ево, ја сам овако:

public String odbrambeniAs() {

        ArrayList<Igrac> listaMladih = new ArrayList<>();

        for (Igrac i : getListaI()) {
            if (i.getGodI() < 3) {
                listaMladih.add(i);
            }
        }

        if (listaMladih.isEmpty()) {
            return "U ovom klubu ne postoji odbrambeni as.";
        }

        Igrac oAS = listaMladih.get(0);
        for (Igrac i : listaMladih) {
            if (i.getBrojP() > oAS.getBrojP()) {
                oAS = i;
            }
        }
        return oAS.getIme();
    }



    public String odmbrambeniAs() {
        Igrac as = null;
        for (Igrac i : getListaIgraca()) {
            if (as.getBrojPostignutihpoena() < i.getBrojPostignutihpoena()) {
                as = i;
            }
            naj = as.getIme();
        }
        return naj;
        }

    }*/

}


