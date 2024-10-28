package petak;

import java.util.Scanner;

public class petak_Domaci1 {
    public static void main(String[] args) {
        /*1. Napisati program koji izracunava povrsinu i obim kruga za radijus r.
        (2 * r * PI)

        Ovo sam nasla na Google-u za
        obim i povrsinu kruga kao formule
        Obim kruga je O = 2 * r * PI
        Površina kruga je P = (r * r) * PI
 */
        Scanner poluprecnik = new Scanner(System.in);
        System.out.println("Unesite zeljeni poluprecnik kruga: ");
        double pi = 3.141592653589793238462643383279502884197;
        double r = poluprecnik.nextDouble();

        double obim_kurga = 2 * r * pi;
        System.out.println("Obim kruga sa poluprecnikom " + r + " je " + obim_kurga);
        double povrsina_kruga = (r * r) * pi;
        System.out.println("Povrsina kruga sa poluprecnikom " + r + " je " + povrsina_kruga);


    }
}
