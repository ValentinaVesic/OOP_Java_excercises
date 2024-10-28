package Ucenicimucenici;

import java.util.ArrayList;

public class Skola extends Ucenik {

    private ArrayList<Ucenik> listaUcenika;

    public Skola(String ime, int brojNeopravdanih, ArrayList<Integer> listaOcena, ArrayList<Ucenik> listaUcenika) {
        super(ime, brojNeopravdanih, listaOcena);
        this.listaUcenika=listaUcenika;

    }


    public ArrayList<Ucenik> getListaUcenika() {
        return listaUcenika;
    }

    public void setListaUcenika(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }


    public double prosek() {
        int sum = 0;
        for (int i = 0; i < listaOcena.size(); i++) {
            sum += listaOcena.get(i);
        }
        double avg = sum / listaOcena.size();
        return avg;
    }



  /*  public ArrayList<Ucenik> vukovci(){
        ArrayList<Ucenik> vuk = new ArrayList<>();
        if (prosek()==5.0){
            vuk.add(Ucenik);
        }
        return vukovci;
    }*/
}
