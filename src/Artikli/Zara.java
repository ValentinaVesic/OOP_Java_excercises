package Artikli;

import java.util.ArrayList;

public class Zara extends Prodavnica{
    public Zara(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl artikl:getListaArtikala()){
            zarada+=artikl.getCena();
        }
        zarada-=(getBrojZaposlenih()*200);

        return zarada;
    }
}
