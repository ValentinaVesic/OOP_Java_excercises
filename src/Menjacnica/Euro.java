package Menjacnica;

public class Euro extends Valuta {
    public Euro() {
        super("Euro", "EUR", 104);
    }

    public void postaviKursNovi(double number) {
        setKurs(number);
    }
}
