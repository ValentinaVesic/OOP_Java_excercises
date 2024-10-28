package domaci_sreda;

import java.util.Scanner;


public class domaci1 {
    public static void main(String[] args) {

        System.out.println("Unesite ocenu ucenika kao celobrojni broj. Dozvoljene vrednosti su: 1,2,3,4,5 ");
        Scanner skener = new Scanner(System.in);
        int ocena = skener.nextInt();

        switch (ocena) {
            case 1:
                System.out.println("(Slovna ocena je - Nedovoljan.");
                break;
            case 2:
                System.out.println("Slovna ocena je - Dovoljan.");
                break;
            case 3:
                System.out.println("Slovna ocena je - Dobar.");
                break;
            case 4:
                System.out.println("Slovna ocena je - Vrlo dobar.");
                break;
            case 5:
                System.out.println("Slovna ocena je - Odlican.");
                break;
            default:
                System.out.println("Niste uneli dozvoljenu vrednost.");
                break;
        }
    }
}
