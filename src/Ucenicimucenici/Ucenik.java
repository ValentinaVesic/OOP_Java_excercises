package Ucenicimucenici;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private int brojNeopravdanih;
    public ArrayList<Integer> listaOcena;

    public Ucenik(String ime, int brojNeopravdanih, ArrayList<Integer> listaOcena) {
        this.ime = ime;
        this.brojNeopravdanih = brojNeopravdanih;
        this.listaOcena = listaOcena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojNeopravdanih() {
        return brojNeopravdanih;
    }

    public void setBrojNeopravdanih(int brojNeopravdanih) {
        this.brojNeopravdanih = brojNeopravdanih;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public double prosek() {
        int sum = 0;
        for (int i = 0; i < listaOcena.size(); i++) {
            sum += listaOcena.get(i);
        }
        double avg = sum / listaOcena.size();
        return avg;
    }

}
