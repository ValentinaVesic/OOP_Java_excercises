package Kupovina;

public class OnlineKorpa extends Korpa {
    public OnlineKorpa(Stavka s, KreditnaKartica kk) {
        super(s, kk);
    }

    @Override
    public void plati() {
        if(getKk().getStanje()>(getS().getCena()*0.9)) {
            getKk().setStanje(getKk().getStanje()-(getS().getCena()*0.9));
        } else {
            System.out.println("Nemate dovoljno para!");
        }
    }
}
