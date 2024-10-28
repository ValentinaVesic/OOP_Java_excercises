package Artikli;

import java.util.ArrayList;

public class Sportvision extends Prodavnica{
    public Sportvision(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public void blackFriday() {
        for (Artikl artikl : getListaArtikala()) {
            artikl.setCena(artikl.getCena() * 0.7);
        }
    }
}
