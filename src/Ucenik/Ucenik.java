package Ucenik;

import java.util.ArrayList;

public abstract class Ucenik {
    /*Napraviti klasu Ucenik koji ima kao atribute ime, fiksna cena skolovanja, listu ocena I broj
    neopravdanih.
Napraviti metode:
- zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
(da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
iznose 15% od fiksne cene skolovanja
Klasa Osnovac nasledjuje klasu Ucenik.
Klasa SrednjoSkolac nasledjuje klasu Ucenik I on ima 25% dodatnih troskova.
Klasa Student nasledjuje klasu Ucenik I on ima 30% dodatnih troskova.*/

    private String ime;
    private double fiksnaCenaSkolovanja;
    private ArrayList<Integer> listaOcena;
    private int brojNeopravdanih;

    public Ucenik(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        this.ime = ime;
        this.fiksnaCenaSkolovanja = fiksnaCenaSkolovanja;
        this.listaOcena = listaOcena;
        this.brojNeopravdanih = brojNeopravdanih;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        this.ime = novoIme;
    }

    public double getFiksnaCenaSkolovanja() {
        return fiksnaCenaSkolovanja;
    }

    public void setFiksnaCenaSkolovanja(double novaFiksnaCenaSkolovanja) {
        this.fiksnaCenaSkolovanja = novaFiksnaCenaSkolovanja;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }



    public int getBrojNeopravdanih() {
        return brojNeopravdanih;
    }

    public void setBrojNeopravdanih(int noviBrojNeopravdanih) {
        this.brojNeopravdanih = noviBrojNeopravdanih;
    }

    //  - zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
    //           (da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).

    public boolean zaUkor() {
        int counter = 0;
        for (int i = 0; i < getListaOcena().size() - 1; i++) {
            if (i == 1) {
                counter++;
            }
        }

        if (getBrojNeopravdanih() > 10 || counter > 10) {
            return true;
        }
        return false;
    }

 //- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I
    // druge troskove koji
 //   iznose 15% od fiksne cene skolovanja

    public double cenaSkolovanja(){
       double cenaSkolovanja = getFiksnaCenaSkolovanja()*1.15;
       return cenaSkolovanja;
    }

    public String toString() {
        return "Ucenik blablabla";
    }
}
