package utorak;

public class useful_stuff_string {
    public static void main(String[] args) {
        String text = "Neki string";
        int duzinaStringa = text.length();
        System.out.println("Duzina stringa je " + duzinaStringa);
/*
        for(int i = 0; i < duzinaStringa; i++) {
            System.out.println("Karakter " + text.charAt(i));
        }

        */
        if (text.toLowerCase().contains("string")) {
            System.out.println("Ima string u stringu.");
        } else {
            System.out.println("nemamo string u stringu");
        }

        // text.trim(); - sece sve praznine unutar stringa;
        // text.isEmpty(); - vraca ako je prazan string
        String.format(text, "neki string");
    }
}
