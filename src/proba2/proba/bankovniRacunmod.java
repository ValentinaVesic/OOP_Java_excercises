package proba2.proba;

public class bankovniRacunmod {

    private int brojRacuna;
    private String imePrezime;
    private double stanjeNaRacunu;

    public bankovniRacunmod(int brojRacuna, String imeIprezime, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImePrezime(){
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public double uplata(double iznos) {
        if (iznos >= 0) {
            setStanjeNaRacunu(getStanjeNaRacunu()+iznos);
            System.out.println("Uplata od " + iznos + "rsd izvrsena. " +
                    "Novo stanje na racunu je: " + getStanjeNaRacunu());
        } else {
            System.out.println("Za uplatu " + iznos + " nije moguce izvrsiti transkaciju," +
                    " iznos je manji od 0");
        }
        return getStanjeNaRacunu();
    }

    public double isplata(double iznos) {
        if (iznos >= 0 && iznos < getStanjeNaRacunu()) {
           setStanjeNaRacunu(getStanjeNaRacunu()-iznos);
            System.out.println("Isplata od " + iznos + "rsd izvrsena. " +
                    "Novo stanje na racunu je: " + getStanjeNaRacunu());

        } else if (iznos <= 0) {
            System.out.println("Za isplatu " + iznos + " nije moguce izvrsiti transakciju, " +
                    "iznos je manji od 0");
        } else {
            System.out.println("Za isplatu " + iznos + " nije moguce izvrsiti transakciju, " +
                    "iznos je veci od stanja na racunu");
        }
        return getStanjeNaRacunu();
    }

    public String toString() {
        return getBrojRacuna() + " " + getImePrezime() + " " + getStanjeNaRacunu();
    }
}

