package petak;

public class Zadatak2 {
    public static void main(String[] args) {
        /*Zadatak 2:
Napraviti dve promenljive sa proizvoljnim brojevima, zatim izracunati
njihov zbir i proizvod. Ako je proizvod veci - ispisati poruku, ako je
zbir veci - ispisati poruku o tome, u suprotnom ispisati poruku da su brojevi jednaki.

         */

        int a = 2;
        int b = 0;

        int zbir = a + b;
        int proizvod = a * b;

        if (proizvod > zbir) {
            System.out.println("Proizvod je veci od zbira.");
        } else if (zbir == proizvod) {
            System.out.println("Proizvod i zbir su jednaki.");
        } else {
            System.out.println("Zbir je veci od proizvoda.");
        }

    }
}
