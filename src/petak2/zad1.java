package petak2;

public class zad1 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prihvata neki String i vraca Koliko on ima samoglasnika.
         */
        String a= "ne mogu ne mogu ne mogu bez tebe ja";
    }

    public static int broj_samoglasnika(String nekiString) {
        int rezultat = 0;
        for (int i = 0; i < nekiString.length(); i++) {
            if (nekiString.charAt(i) == 'a' || nekiString.charAt(i) == 'e') {
                rezultat++;

            }
        }
        return rezultat;
    }
}









