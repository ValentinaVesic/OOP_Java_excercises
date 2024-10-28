package Probni;

import java.util.ArrayList;

/*
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
 */
public class Zara extends Prodavnica {
    public Zara(int zaposleni, ArrayList<Artikl> artikli) {
        super(zaposleni, artikli);
    }

    @Override
    public double zarada() {
        double sum = 0;
        for(Artikl a:getArtikli()) {
            sum+=a.getCena();
        }
        return sum-(getZaposleni()*200);
    }
}
