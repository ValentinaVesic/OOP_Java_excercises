package Knjiga;

import java.util.ArrayList;

public class Pisac {
    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> listaKnjiga;

    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga){
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.listaKnjiga=listaKnjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public String najpoznatijaKnjiga() {
        Knjiga najpoznatija = getListaKnjiga().getFirst();
        for (int i = 1; i < getListaKnjiga().size(); i++) {
            if (getListaKnjiga().get(i).getBrojStrana() > najpoznatija.getBrojStrana()) {
                najpoznatija = getListaKnjiga().get(i);
            }
        }
        return najpoznatija.getNaslov();
    }

    public int vremePisanja() {
        Knjiga poslednjaKnjiga = getListaKnjiga().getLast();
        Knjiga prvaKnjiga = getListaKnjiga().getFirst();
        return poslednjaKnjiga.getGodinaIzdavanja() - prvaKnjiga.getGodinaIzdavanja();
    }


}
