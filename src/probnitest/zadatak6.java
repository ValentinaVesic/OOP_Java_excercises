package probnitest;

public class zadatak6 {
    public static void main(String[] args) {
        /*Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.*/

        String[] niz1 = {"Ovo", "je", "moj", "prvi", "niz", "Stringova"};
        String[] niz2 = {"Ovo", "je", "moj", "drugi", "niz", "Stringova"};
        String[] niz3 = konkatenacija(niz1, niz2);
        stampanje(niz3);

    }
    public static String[] konkatenacija(String[] niz, String[] nizz) {
        String[] niz3 = new String[niz.length];
        for (int i = 0; i < niz.length; i++) {
            niz3[i] = niz[i] + nizz[i];
        }
        return niz3;
    }
    public static void stampanje(String [] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

}
