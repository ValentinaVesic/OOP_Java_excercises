package Auto;

public class auto {

    /*
    Zadatak 1:
Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
     */

    String model;
    private int maxBrzina;
    double cena;
    String boja;

    private auto(String model, int maxBrzina,double cena, String boja) {
        this.model = model;
        this.maxBrzina = maxBrzina;
        this.cena=cena;
        this.boja=boja;
    }

    public int vremePredjenogPuta() {
        return 1000/maxBrzina;
    }
/*
    public void setCena(double novaCena) {
        if(boja.equalsIgnoreCase("ljubicasta")) {
            novaCena=cena*0.9;
        } else {
novaCena=        }
    }
*/
    public String toString() {
        return model + " " + maxBrzina + " " + cena + " " + boja;
    }
}