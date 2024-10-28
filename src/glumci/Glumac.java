package glumci;

public class Glumac {
    /*Napraviti klasu Glumac koji ima godinu rodjenja I ime.
Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
Napraviti metode:
- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma*/
     private int godinaRodjenja;
     private String ime;

     public Glumac(int godinaRodjenja, String ime){
         this.godinaRodjenja=godinaRodjenja;
         this.ime=ime;
     }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
