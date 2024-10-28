package Shopping;

public class Korpa {

    //Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.

    private Stavka stavka;
    private KreditnaKartica kreditnaKartica;

    public Korpa(Stavka stavka, KreditnaKartica kreditnaKartica) {
        this.stavka = stavka;
        this.kreditnaKartica = kreditnaKartica;
    }

    public Stavka getStavka() {
        return stavka;
    }

    public void setStavka(Stavka stavka) {
        this.stavka = stavka;
    }

    public KreditnaKartica getKreditnaKartica() {
        return kreditnaKartica;
    }

    public void setKreditnaKartica(KreditnaKartica kreditnaKartica) {
        this.kreditnaKartica = kreditnaKartica;
    }

    /*Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.*/

    public void plati() {
        double iznos;
        if (getKreditnaKartica().getStanjeNaRacunu() > getStavka().getCena()) {
            iznos = getKreditnaKartica().getStanjeNaRacunu() - getStavka().getCena();
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu");
        }

    }

    public double viseStavki() {
        double brojStavki;
        brojStavki = (getKreditnaKartica().getStanjeNaRacunu() / getStavka().getCena());
        return brojStavki;
    }
}

