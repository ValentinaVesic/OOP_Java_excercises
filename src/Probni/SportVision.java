package Probni;

import java.util.ArrayList;

/*
Napraviti klasu SportVision koja nasledjuje Prodavnicu I
 on za black Friday daje popust od 30% na sve artikle.
 */
public class SportVision extends Prodavnica{

    public SportVision(int zaposleni, ArrayList<Artikl> artikli) {
        super(zaposleni, artikli);
    }

    @Override
    public void blackFriday() {
        for(Artikl a:getArtikli()) {
            a.setCena(a.getCena()*0.7);
        }
    }

    @Override
    public double zarada() {
        double sum=0;
        for(Artikl a:getArtikli()) {
            sum+=a.getCena();
        }
        return sum-(getZaposleni()*100);
    }
}
