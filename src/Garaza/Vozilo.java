package Garaza;

public class Vozilo {

    private double cena;
    private int kilometraza;
    private int godinaProizvodnje;

    public Vozilo (double cena, int kilometraza, int godinaProizvodnje){
        this.cena = cena;
        this.kilometraza=kilometraza;
        this.godinaProizvodnje=godinaProizvodnje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(int kilometraza) {
        this.kilometraza = kilometraza;
    }
}
