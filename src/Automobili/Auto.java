package Automobili;

public class Auto {

    /*
    Zadatak 1:
Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
     */

    String model;
    int maxBrzina;
    double cena;
    String boja;

    public Auto(String model, int maxBrzina,double cena, String boja) {
        this.model = model;
        this.maxBrzina = maxBrzina;
        this.cena=cena;
        this.boja=boja;
    }

    public int vremePredjenogPuta() {
        return 1000/maxBrzina;
    }

    public double popustNaBoju() {
        if(boja.equalsIgnoreCase("ljubicasta")) {
            return cena*0.9;
        } else {
            return cena;
        }
    }

    public String toString() {
        return model + " " + maxBrzina + " " + cena + " " + boja;
    }
}