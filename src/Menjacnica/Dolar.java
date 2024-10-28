package Menjacnica;

public class Dolar extends Valuta {
    public Dolar() {
        super("Dolar", "USD", 104.6);
    }

    public void postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
    }
}


