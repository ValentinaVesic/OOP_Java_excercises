package ponedeljak2;

public class zadatak6 {
    public static void main(String[] args) {
        /*   //Napraviti metodu koja prima dva niza razlicitih duzina i sabire ih. */
        int[] niz1 = {1, 2, 3};
        int[] niz2 = {1, 2, 3, 4};
        int[] niz3 = sumiraniNiz(niz1, niz2);
        stampanjeNiza(niz3);

    }

    public static int[] sumiraniNiz(int[] niz1, int[] niz2) {
        int[] manjiNiz = niz1;
        int[] duziNiz = niz2;
        if (niz1.length < niz2.length) {
            manjiNiz = niz1;
            duziNiz = niz2;
        } else if (niz1.length > niz2.length) {
            manjiNiz = niz2;
            duziNiz = niz1;
        }
        int[] niz3 = new int[duziNiz.length];
        int suma = 0;
        for (int i = 0; i < niz3.length; i++) {
            if (i < manjiNiz.length) {
                niz3[i] = duziNiz[i] + manjiNiz[i];
            } else if (i < duziNiz.length) {
                niz3[i] = duziNiz[i];
            }
        } return niz3;

    }
        public static void stampanjeNiza ( int[] niz){
            for (int i = 0; i < niz.length; i++) {
                System.out.println(niz[i]);
            }
        }
    }

