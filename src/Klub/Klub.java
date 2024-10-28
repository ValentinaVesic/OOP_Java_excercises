package Klub;

import java.util.ArrayList;

public abstract class Klub {

    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaIgraca;


    public Klub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    /*Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)*/

    public String najiskusnijiIgrac(){
        int najduzeGodine = 0;
        Igrac najiskusniji = listaIgraca.get(0);
        String ime = "";
        for (Igrac i:listaIgraca){
            if (i.getGodineIskustva()> najiskusniji.getGodineIskustva()){
                najiskusniji = i;
            }

        }
        return najiskusniji.getIme();

    }

 //   - ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.

    public int ukupnoPoena(){
        int ukupno = 0;
        for(Igrac i:listaIgraca){
            ukupno+= i.getBrojPostignutihpoena();
        }
        return ukupno;
    }

    public abstract void vrednosttima();

    @Override
    public String toString() {
        return "Klub{" +
                "naziv='" + naziv + '\'' +
                ", grad='" + grad + '\'' +
                ", listaIgraca=" + listaIgraca +
                '}';
    }
}