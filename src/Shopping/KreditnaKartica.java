package Shopping;

public class KreditnaKartica {

    //Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.

    private double stanjeNaRacunu;

    public KreditnaKartica(double stanjeNaRacunu){
        this.stanjeNaRacunu=stanjeNaRacunu;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
}
