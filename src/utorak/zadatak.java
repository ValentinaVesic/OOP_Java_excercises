package utorak;

import java.util.Scanner;

public class zadatak {

    public static void main(String[] args) {
        /* Zadatak 4:
Napraviti program gde cete preko Scanner-a unositi neki String sve dok ne unesete tacku, cim se unese tacka
treba kao rezultat vratiti sav prethodno uneti String

         */
        Scanner scanner = new Scanner(System.in);
        String text = "";
/*moramo doduse text=scanner.nextLine() da stavimo unutar while petlje jer ce onda svakom iteracijom
da nam da mogucnost da unesemo nov String, zatim mozes pitati cim uneses taj String da li je jednak tacki*/
        while (true) {
            text = scanner.nextLine();
            if (text.contains(".")) {
                break;
            }
        }
        System.out.println("Tekst je " + text);
        }
         /* while (broj<10) {
            if (broj == 6) {
                break;
            }
            System.out.println("Broj je " + broj);
            broj++;*/


    }

