package cetvrtak;


public class Uvod {
    public static void main(String[] args) {
        // Ovo je jednolinijski komentar
        /* Ovo
        je
        višelinijski
        komentar
         */

        int ceoBroj; // deklaracija promenjive
        ceoBroj = 5; //inicijalizacija promenjive

        int ceoBroj1 = -7; // deklaracija i inicijalizacija
        double realanBroj = 2.521;
        char karakter = 'a';
        boolean logickiTip = 5==2; //logicki tip = false
        String text = "Ovo je neki tekst!";

        //Aritmeticki operatori
        int sabiranje = 5 + 3;
        System.out.println("Rezultat sabiranja je: " + sabiranje);

        int oduzimanje = 5-2;
        System.out.println("Rezultat oduzimanja je: "+ oduzimanje);

        int mnozenje = 8*2;
        System.out.println("Rezultat mnozenja je: " + mnozenje);

        int deljenje = 5/2;
        System.out.println("Celobrojni rezultat deljenja je: "+ deljenje);

        double delenje = 5/2;
        System.out.println("Realan rezultat delenja je: "+ delenje);

        double deoba = 5.0/2;
        System.out.println("Rezultat deobe je: "+deoba  );

        // operatori pridruzivanja
        int broj = 1;
        broj = broj + 5;
        broj += 5;

        broj-=7;
        broj*=2;
        broj/=8;

        //Operatori poredjenja
        System.out.println(5>2);
        System.out.println(5<2);
        System.out.println(5>=5);
        System.out.println(4<=5);
        System.out.println(5==5);
        System.out.println(5!=5);

        //konkatenacija
        String txt1 = "Ovo je ";
        String txt2 = "moj string";
        String txt3 = txt1 + txt2;
        System.out.println(txt3);

        //sve u lower case
        System.out.println(txt3.toLowerCase());
        //sve u upper case
        System.out.println(txt3.toUpperCase());
        //poredjenje
        System.out.println(txt1.equals(txt2));
        //poredjenje non case sensitive
        System.out.println(txt1.equalsIgnoreCase(txt2));


    }
}