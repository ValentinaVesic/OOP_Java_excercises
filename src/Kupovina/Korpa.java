package Kupovina;

public class Korpa {

    /*
    Zadatak 2:
Napraviti klasu Stavka koja ima od atributa naziv i cenu.
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno,
 ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo

OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.
     */

    private Stavka s;
    private KreditnaKartica kk;

    public Korpa(Stavka s, KreditnaKartica kk) {
        this.s=s;
        this.kk=kk;
    }

    public void plati() {
        if(getKk().getStanje()>getS().getCena()) {
            kk.setStanje(getKk().getStanje()-getS().getCena());
        } else {
            System.out.println("Nemate dovoljno para!");
        }
    }

    public int viseStavki() {
        return (int) (getKk().getStanje()/getS().getCena());
    }

    public Stavka getS() {
        return s;
    }

    public void setS(Stavka s) {
        this.s = s;
    }

    public KreditnaKartica getKk() {
        return kk;
    }

    public void setKk(KreditnaKartica kk) {
        this.kk = kk;
    }

    public String toString() {
        return s + " " + kk;
    }
}
