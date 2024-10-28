package albumi;

public class RokMuzicar extends Muzicar {

    public RokMuzicar(String naziv, int godinaObjavljivanja, int brojPesama, String ime, int godinaPocetkaKarijere) {
        super(naziv, godinaObjavljivanja, brojPesama, ime, godinaPocetkaKarijere);
    }

    @Override
    public double zarada() {
        return (getBrojPesama() * 750);
    }
}
