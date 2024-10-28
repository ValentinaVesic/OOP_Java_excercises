package albumi;

public abstract class Album {
    /*Zadatak 3:
Napraviti klasu Album koji ima kao atribute naziv, godinu objavljivanja I broj pesama.
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku
da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.*/

    private String naziv;
    private int godinaObjavljivanja;
    private int brojPesama;


    public Album(String naziv, int godinaObjavljivanja, int brojPesama){
        this.naziv=naziv;
        this.godinaObjavljivanja=godinaObjavljivanja;
        this.brojPesama=brojPesama;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojPesama() {
        return brojPesama;
    }

    public void setBrojPesama(int brojPesama) {
        this.brojPesama = brojPesama;
    }
}
