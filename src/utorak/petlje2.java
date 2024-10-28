package utorak;

public class petlje2 {
    public static void main(String[] args) {
        int i = 0;

        /* while (i < 5) {
            System.out.println("Hello world!");
            i++;
        }

        do {
            System.out.println("Hello world");
            i++;
        } while (i<5);

        int broj = 0;
        while (broj<10) {
            if (broj == 6) {
                broj++;
                continue;
            }
            System.out.println("Broj je " + broj);
            broj++;

         */
        int broj = 0;
        while (broj<10) {
            if (broj == 6) {
                break;
            }
            System.out.println("Broj je " + broj);
            broj++;
        }
    }
}
