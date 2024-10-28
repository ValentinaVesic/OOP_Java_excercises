package probnitest;

public class zadatak5 {
    public static void main(String[] args) {
        /*Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.*/
        String[] niz = {"duplikat", "neduplikat", "duplikat", "ja", "ti", "on", "duplikat", "ti"};
        String[] niz2 = bezDuplikata(niz);
        stampanje(niz2);

    }
    public static String[] bezDuplikata(String[] niz) {
        int duzinaPrvogNiza = niz.length;
        int nula = 0;

        String[] noviNiz = new String[niz.length];
        noviNiz[0] = niz[0];
        for (int i = 1; i < duzinaPrvogNiza; i++) {
            if (niz[0].equalsIgnoreCase(niz[i])) {
                noviNiz[niz.length-1] = niz[i];
            } else {
                noviNiz[i] = niz[i];
            }
        }
        for (int i = 0; i<duzinaPrvogNiza; i++){
            do {noviNiz[niz.length-1] = niz[i];}
            while
                (niz[i]==null);
            }{

            }




/*
        for (int j = 0; j<duzinaPrvogNiza; j++){
            if (noviNiz[j]==null){
                noviNiz[j] = noviNiz[j++];
            }
        }*/

        /*
        for (int i = 0; i < niz.length; i++) {
            if (niz[0].equalsIgnoreCase(niz[i])) {
                duzinaPrvogNiza--;
            }
        }
        String[] bez = new String[duzinaPrvogNiza];
        for (int j = 0; j < duzinaPrvogNiza; j++) {
            bez[j] = noviNiz[j];
        }

*/
        return noviNiz;
    }

    public static void stampanje(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
