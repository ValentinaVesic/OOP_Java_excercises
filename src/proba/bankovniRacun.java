package proba;

public class bankovniRacun {

    int brojRacuna;
    String imePrezime;
    double stanjeNaRacunu;


    public bankovniRacun(int brojRacuna, String imeIprezime, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public double uplata(double iznos) {
        if (iznos >= 0) {
            stanjeNaRacunu = stanjeNaRacunu + iznos;
            System.out.println("Uplata od " + iznos + "rsd izvrsena. Novo stanje na racunu je: " + stanjeNaRacunu);
        } else {
            System.out.println("Za uplatu " + iznos + " nije moguce izvrsiti transkaciju, iznos je manji od 0");
        }
        return stanjeNaRacunu;
    }

    public double isplata(double iznos) {
        if (iznos >= 0 && iznos < stanjeNaRacunu) {
            stanjeNaRacunu = stanjeNaRacunu - iznos;
            System.out.println("Isplata od " + iznos + "rsd izvrsena. Novo stanje na racunu je: " + stanjeNaRacunu);

        } else if (iznos <= 0) {
            System.out.println("Za isplatu " + iznos + " nije moguce izvrsiti transakciju, " +
                    "iznos je manji od 0");
        } else {
            System.out.println("Za isplatu " + iznos + " nije moguce izvrsiti transakciju, " +
                    "iznos je veci od stanja na racunu");
        }
        return stanjeNaRacunu;
    }

    public String toString() {
        return brojRacuna + " " + imePrezime + " " + stanjeNaRacunu;
    }
}

