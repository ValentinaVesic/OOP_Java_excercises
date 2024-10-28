package glumci;

public class Film {
    /*Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
*/
    private int godinaObjavljivanja;
    private double zaradjenePare;
    private Glumac g;

    public Film(int godinaObjavljivanja, double zaradjenePare, Glumac g) {
        this.godinaObjavljivanja=godinaObjavljivanja;
        this.zaradjenePare=zaradjenePare;
        this.g=g;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public double getZaradjenePare() {
        return zaradjenePare;
    }

    //- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
    //- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma


    public Glumac getG() {
        return g;
    }

    public void setG(Glumac novaZvezda) {
        this.g = novaZvezda;
    }


    public int godineGlavnogGlumca(){
        return (getGodinaObjavljivanja()-getG().getGodinaRodjenja());
    }

    public double troskovi(){
        return (getZaradjenePare()*0.2);
    }
}


