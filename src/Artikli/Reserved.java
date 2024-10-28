package Artikli;

import java.util.ArrayList;

public class Reserved extends Prodavnica{
    private double ocekivaniPrihod;
    public Reserved(int brojZaposlenih, ArrayList<Artikl> listaArtikala, double ocekivaniPrihod) {
        super(brojZaposlenih, listaArtikala);
        this.ocekivaniPrihod=ocekivaniPrihod;
    }

    public double getOcekivaniPrihod() {
        return ocekivaniPrihod;
    }

    public void setOcekivaniPrihod(double ocekivaniPrihod) {
        this.ocekivaniPrihod = ocekivaniPrihod;
    }
    //    Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu,
    //    ukoliko je to ispunjeno
    //    svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.


    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for (Artikl artikl:getListaArtikala()){
            zarada+=artikl.getCena();
        }

        if (zarada>=ocekivaniPrihod){
            zarada-=getBrojZaposlenih()*200;
        } else {
            zarada-=getBrojZaposlenih()*100;
        }

        return zarada;
    }

    @Override
    public String toString() {
        return "Reserved{" +
                "ocekivaniPrihod=" + ocekivaniPrihod +
                '}';
    }
}
