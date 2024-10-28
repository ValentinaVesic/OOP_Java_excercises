package probnitest;

public class zadatak1 {
    public static void main(String[] args) {
        /*
Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja
tog String-a u nizu.*/
        String[] niz1 = {"jedan", "dva", "tri", "cetiri", "pet", "tri", "tri"};
        String neki = "tri";
        int ponavljanje = brojPonavljanjaStringaUNizu(niz1, neki);
        System.out.println(ponavljanje);
    }

    public static int brojPonavljanjaStringaUNizu(String[] niz, String string) {
        int broj = 0;
        for (int i = 0; i < niz.length; i++) {
            if (string.equalsIgnoreCase(niz[i])) {
                broj++;
            }
        }
        return broj;
    }
}
