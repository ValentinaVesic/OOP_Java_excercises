package Shopping;

public class OnlineKorpa extends Korpa{
    public OnlineKorpa(Stavka stavka, KreditnaKartica kreditnaKartica) {
        super(stavka, kreditnaKartica);
    }

    @Override
    public void plati() {
        double iznos;
        if (getKreditnaKartica().getStanjeNaRacunu() > (getStavka().getCena()*0.90)){
            iznos = getKreditnaKartica().getStanjeNaRacunu() - (getStavka().getCena()*0.90);
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu");
        }
    }
}
