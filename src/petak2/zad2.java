package petak2;

public class zad2 {
    public static void main(String[] args) {
        /*Zadatak 2:
Napraviti metodu koja prihvata dva broja i stampa poruku koji
je od ta dva broja veci.*/

    int a = 5;
    int b = 8;
    int d = -5;
    veciBroj(a,d);

    }
    public static void veciBroj (int x, int y) {
        if(x>y){
            System.out.println("Veci broj je " + x);
        } else if (x<y)
        {
            System.out.println("Veci broj je " + y);

        } else {
            System.out.println("Brojevi su jednaki.");
        }
        return;
    }
   }

