package Probni;

import java.util.ArrayList;

/*
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu,
 ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
 */
public class Reserved extends Prodavnica{

    private double kvota;
    public Reserved(int zaposleni, ArrayList<Artikl> artikli, double kvota) {
        super(zaposleni, artikli);
        this.kvota=kvota;
    }

    @Override
    public double zarada() {
       double sum=0;
       for(Artikl a:getArtikli()) {
           sum+=a.getCena();
       }
       if(sum>=kvota) {
           return sum-(getZaposleni()*200);
       } else {
           return sum-(getZaposleni()*100);
       }
    }
}
