package utorak;

public class zad2 {
    public static void main(String[] args) {
      /*  Zadatak 3:
        a)Stampati brojeve od 1 do 40 osim onih koji su deljivi sa 6.
        b)Stampati brojeve od 1 do 100, ukoliko naidjete na 78 zaustaviti rad.

       */

        int i = 1;
        while (i < 100) {
            if (i == 78) {
                break;
            }
            System.out.println(i);
            i++;

        }
    }
}
