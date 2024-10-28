package albumi;

public class Reper extends Muzicar{
    public Reper(String naziv, int godinaObjavljivanja, int brojPesama, String ime, int godinaPocetkaKarijere) {
        super(naziv, godinaObjavljivanja, brojPesama, ime, godinaPocetkaKarijere);
    }

    @Override
    public double zarada() {
        return (getBrojPesama() * 500);
    }
}
