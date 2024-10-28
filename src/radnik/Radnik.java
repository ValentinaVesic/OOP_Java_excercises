package radnik;

public class Radnik {

/*Zadatak 2:
Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.*/


    private int id;
    private int godinaZaposlenja;
    private double plataRadnika;

    public Radnik(int id, int godinaZaposlenja, double plataRadnika) {
        this.id = id;
        this.godinaZaposlenja = godinaZaposlenja;
        this.plataRadnika = plataRadnika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }

    public void setGodinaZaposlenja(int godinaZaposlenja) {
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public double getPlataRadnika() {
        return plataRadnika;
    }

    public void setPlataRadnika(double plataRadnika) {
        this.plataRadnika = plataRadnika;
    }

    //koliki je staz??
    public int izracunajStaz() {
        return (2024 - getGodinaZaposlenja());
    }


//metodu koja daje povisicu za 20%
//ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
//staz duzi od 10 godina.


    public void dajPovisicu() {
        int staz = izracunajStaz();
        if (staz > 5) {
            setPlataRadnika(getPlataRadnika() * 1.20);
        } else if (staz > 10) {
            setPlataRadnika(getPlataRadnika() * 1.40);
        }
    }

    public String toString() {
        return //Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
                "Radnikov id je " + getId() + "godina zaposlenja je " + getGodinaZaposlenja() +
                        ", a njegova plata je " + getPlataRadnika();
    }
}
