package Menjacnica;

public class Main {
    public static void main(String[] args) {
        Dolar dolar = new Dolar();
        System.out.println(dolar);
        dolar.setKurs(110);
        dolar.konvertujUdinare(100);

        Euro euro = new Euro();
        System.out.println(euro);
        euro.setKurs(105);
        euro.konvertujUdinare(100);

    }
}
