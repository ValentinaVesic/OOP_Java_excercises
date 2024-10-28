package Planinarenje;

import java.util.ArrayList;

public class Planinar {
    /*Napraviti klasu Planinar
    atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze
     da se popne)
    Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena
    visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog
 	planinara i ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste*/

    private ArrayList<Planina> listaPlanina;
    private double maxUspon;

    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public ArrayList<Planina> dodaj(Planina p) {
        // ArrayList<Planina> planine = new ArrayList<>();
        if (p.getVisina() <= getMaxUspon()) {
            getListaPlanina().add(p);
        }
        return getListaPlanina();
    }


    //-opasne() -> metoda vraca listu planina koje su opasne za penjanje

    public ArrayList<Planina> opasne() {
        ArrayList<Planina> opasnePlanine = new ArrayList<>();
        for (Planina p : getListaPlanina()) {
            if (p.isOpasnost()) {
                opasnePlanine.add(p);
            }
        }
        return opasnePlanine;
    }

    // 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog
    // 	planinara i ako je opasna
    public void izbaci() {
        for (int i = getListaPlanina().size() - 1; i >= 0; i--) {
            if (getListaPlanina().get(i).getVisina() > getMaxUspon() || getListaPlanina().get(i).isOpasnost()) {
                getListaPlanina().remove(i);
            }
        }
    }

    //	-najveca()-> vraca najvecu planinu iz planinarove liste
    public String najveca() {
        if (getListaPlanina().isEmpty()) {
            return "Nema planine na koju se ovaj planinar moze popeti";
        } else {
            Planina max = getListaPlanina().get(0);
            for (Planina p : getListaPlanina()) {
                if (p.getVisina() >= max.getVisina()) {
                    max = p;
                }
            }
            return max.getNaziv();

        }
    }

    public String toString() {
        return "Lista planina ovog planinara je " + listaPlanina + ". Maksimalna visina" +
                "na koju ovaj planinar moze da se popne je: " + maxUspon;
    }
}
