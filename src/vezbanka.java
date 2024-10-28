import java.util.Scanner;

public class vezbanka {
    public static void main(String[] args) {
        /*Zadatak 1:
Napraviti program gde cete uneti neki proizvoljan broj preko Scanner-a,
zatim ispitati da li je taj broj paran ili neparan, proveriti da li spada
u brojeve visokog ranga(da li je veci od 50), takodje proveriti da li je
taj broj deljiv sa 2 i sa 3. */


        Scanner scanner = new Scanner(System.in);
        int proizvoljan = scanner.nextInt();

        if (proizvoljan%2 == 0){
            System.out.println("Broj je paran.");
            System.out.println("Broj je deljiv sa 2.");
        }
        if (proizvoljan%2==1) {
            System.out.println("Broj je neparan");
        }
        if (proizvoljan>50) {
            System.out.println("Broj spada u brojeve visokog ranga.");
        }
        if (proizvoljan%3==0) {
            System.out.println("Broj je deljiv sa 3.");
        }

    }

        /*

Zadatak 2:
Napraviti program gde cete uneti neki mesec, pomocu Swtich-a napraviti
ispis o tome Koliko taj mesec ima dana.

Zadatak 3:
Napraviti program za Biblioteku, kao atribut imate clanarinu koja je 1000,
zatim unesite vas status ("student","penzioner" ili "zaposlen).
Penzioneri imaju 20% popusta na clanarinu dok studenti imaju 10%.
Zaposleni nemaju nikakav popust.

Zadatak 4:
Pomocu for petlje proci kroz neku reci I izracunati broj pojavljivanja slova 'a'.

Zadatak 5:
Napraviti program koji ide od 1 do 30 I stampa svaki broj uz poruku da li je paran ili neparan.*/

    }
