package probnitest;

public class zadatak3 {
    public static void main(String[] args) {/*Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.*/

        int[] niz1 = {10, 2, 3, 4, 10, 11, 159, 75, 41};
        int proizvod = proizvodSvihParnihUNizu(niz1);
        System.out.println(proizvod);

    }

    public static int proizvodSvihParnihUNizu(int[] niz) {
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                proizvod *= niz[i];
            }
        }
        return proizvod;
    }
}
