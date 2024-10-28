package Probni;

import java.util.ArrayList;

public abstract class   Prodavnica {
    /*

Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
     */

    private int zaposleni;
    private ArrayList<Artikl> artikli;

    public abstract double zarada();

    public Prodavnica(int zaposleni, ArrayList<Artikl> artikli) {
        this.zaposleni=zaposleni;
        this.artikli= artikli;
    }

    public ArrayList<Artikl> triftKolekcija() {
        ArrayList<Artikl> lista = new ArrayList<>();
        for(Artikl a:getArtikli()) {
            if(2024-a.getGodina()>20) {
                lista.add(a);
            }
        }
        return lista;
    }

    public void izbaciPrestaro() {
        for(int i=getArtikli().size()-1; i>=0; i--) {
            if(2024-getArtikli().get(i).getGodina()>30) {
                artikli.remove(i);
            }
        }
    }

    public void blackFriday() {
        for(Artikl a:getArtikli()) {
            a.setCena(a.getCena()*0.5);
        }
    }

    public boolean pronadji(String nekiArtikl) {
        for(Artikl a:getArtikli()) {
            if(a.getNaziv().equalsIgnoreCase(nekiArtikl)) {
                return true;
            }
        }
        return false;
    }

    public int getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(int zaposleni) {
        this.zaposleni = zaposleni;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    public String toString() {
        return zaposleni + " " + artikli;
    }
}
