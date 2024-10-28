package Artikli;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prodavnica {
    /*Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
    Napraviti metode:
            -blackFriday() -> sve artikle iz liste spusta za 50%
            -pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
            -izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
    Napraviti klasu HM  nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
    Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
    Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
    svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
    Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
    Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
    Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih. */

    private int brojZaposlenih;
    private ArrayList<Artikl> listaArtikala;

    public Prodavnica(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        this.brojZaposlenih = brojZaposlenih;
        this.listaArtikala = listaArtikala;
    }

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public void setListaArtikala(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    //        -blackFriday() -> sve artikle iz liste spusta za 50%


    @Override
    public String toString() {
        return "Prodavnica{" +
                "brojZaposlenih=" + brojZaposlenih +
                ", listaArtikala=" + listaArtikala +
                '}';
    }

    public void blackFriday() {
        for (Artikl artikl : listaArtikala) {
            artikl.setCena(artikl.getCena() / 2);
        }
    }

//-pronadji(String a) -> trazi prosledjeni naziv u listi artikala

    public void pronadji(String a) {
        for (Artikl artikl : listaArtikala) {
            if (a.equalsIgnoreCase(artikl.getNaziv())) {
                System.out.println(artikl);
            }
        }
    }

    //    -triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
    public ArrayList<Artikl> triftKolekcija() {
        ArrayList<Artikl> trift = new ArrayList<>();
        for (Artikl artikl : listaArtikala) {
            if(artikl.getGodinaProizvodnje()<2004){
                trift.add(artikl);
            }
        }
        return trift;
    }

    //-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve
    // artikle, uz to da svakog zaposlenog placaju 100

    public double ukupnaZarada(){
        double zarada = 0;
        for(Artikl artikl:listaArtikala){
            zarada+=artikl.getCena();
        }
       zarada-=(brojZaposlenih*100);

        return zarada;
    }
// -izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od
// 30 god

    public void izbaciPrestaro(){
        for (Artikl artikl:listaArtikala){
            if(artikl.getGodinaProizvodnje()<1994){
                listaArtikala.remove(artikl);
            }
        }
    }
}
