package albumi;

public class Muzicar extends Album{
    /*Zadatak 3:
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku
da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.*/

    private String ime;
    private int godinaPocetkaKarijere;

    public Muzicar(String naziv, int godinaObjavljivanja, int brojPesama, String ime, int godinaPocetkaKarijere) {
        super(naziv, godinaObjavljivanja, brojPesama);
        this.ime=ime;
        this.godinaPocetkaKarijere= godinaPocetkaKarijere;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPocetkaKarijere() {
        return godinaPocetkaKarijere;
    }

    public void setGodinaPocetkaKarijere(int godinaPocetkaKarijere) {
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
    }

    //- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku
 //   da mu je to prvi hit

    public void prviHit(){
        if (getGodinaPocetkaKarijere()==getGodinaObjavljivanja()){
            System.out.println("Prvi hit jej");
        }
    }

    //- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.

    public double zarada(){
        return (getBrojPesama()*1000);
    }

}
