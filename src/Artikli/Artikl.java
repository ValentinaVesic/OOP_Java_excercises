package Artikli;

public class Artikl {

    /* Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
    Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
    Napraviti metode:
            -blackFriday() -> sve artikle iz liste spusta za 50%
            -pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
            -izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
    Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
    Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
    Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
    svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
    Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
    Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
    Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih. */

    private String naziv;
    private double cena;
    private int godinaProizvodnje;

    public Artikl (String naziv, double cena, int godinaProizvodnje){
        this.naziv=naziv;
        this.cena=cena;
        this.godinaProizvodnje=godinaProizvodnje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String toString(){
        return "Artikal " + getNaziv() + " kosta " + getCena() + ", a proizveden je " + getGodinaProizvodnje();
    }
}
