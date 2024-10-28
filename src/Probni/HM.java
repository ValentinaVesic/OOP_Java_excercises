package Probni;

import java.util.ArrayList;

public class HM extends Prodavnica{
    public HM(int zaposleni, ArrayList<Artikl> artikli) {
        super(zaposleni, artikli);
    }

    @Override
    public double zarada() {
        double sum=0;
        for(Artikl a:getArtikli()) {
            sum+=a.getCena();
        }
        return sum-(getZaposleni()*150);
    }
    /*
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
     */
}
