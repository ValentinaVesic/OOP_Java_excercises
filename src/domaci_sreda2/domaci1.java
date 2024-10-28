package domaci_sreda2;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        /*1. Napisati program koji omogucava korisniku da unese niz celih brojeva.
         Program treba da ima sledeće metode:
*/
        int a = 0;
        int[] niz1 = unosNiza5Elemenata(a);
        System.out.println("Cestitamo uneli ste sledeci niz");
        stampanjeNiza(niz1);
        double srednjaVrednost = srednjaVrednost(niz1);
        System.out.println("Srednja vrednost clanova niza je " + srednjaVrednost);
        int suma = sabiranjeDvocifrenihBrojevaNiza(niz1);
        System.out.println("Suma dvocifrenih brojeva u nizu je " + suma);
        int razlika = razlikaMaxMin(niz1);
        System.out.println("Razlika je " + razlika);

    }
    public static int[] unosNiza5Elemenata (int a){
        Scanner scanner = new Scanner(System.in);
        a = 0;
        int [] niz = new int [5];
        for (int i = 0; i<niz.length;i++){
            a = scanner.nextInt();
            niz[i]=a;
        }
        return niz;
    }
    public static void stampanjeNiza(int[] niz){
        for (int i = 0; i< niz.length; i++){
            System.out.println(niz[i]);
        }
    }
    //- Metoda za racunanje srednje vredsnoti brojeva u nizu
    public static double srednjaVrednost (int [] niz){
        double zbir = 1;
        for (int i = 0; i<niz.length;i++) {
            zbir+=niz[i];
        }
        return zbir/niz.length;
    }
    //- Metoda za sabiranje svih dvocifrenih brojeva

    public static int sabiranjeDvocifrenihBrojevaNiza(int[] niz){
        int suma = 0;
        for (int i = 0; i<niz.length;i++){
            if ((niz[i]>9 && niz[i]<100) || (niz[i]<-9 && niz[i]>-100) ){
                suma+=niz[i];
            }
        }
        return suma;
    }
    //- Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza

    public static int razlikaMaxMin (int[]niz){
        int maksimum = niz[0];
        int minimum = niz[0];
        for (int i =1; i<niz.length; i++){
        if (maksimum<niz[i]){
            maksimum = niz[i];
        }
        }
        for (int i = 1; i<niz.length; i++){
            if (minimum>niz[i]){
                minimum=niz[i];
            }
        }
        return (maksimum-minimum);
    }
}
