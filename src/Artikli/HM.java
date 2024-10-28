package Artikli;

import java.util.ArrayList;

public class HM extends Prodavnica{
    public HM(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl artikl:getListaArtikala()){
            zarada+=artikl.getCena();
        }
        zarada-=(getBrojZaposlenih()*150);

        return zarada;
    }
}
