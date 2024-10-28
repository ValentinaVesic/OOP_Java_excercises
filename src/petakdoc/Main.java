package petakdoc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Integer je wrapper klasa od int
        //koju java obavije da ga pretvori
        //iz prostog u slozen tip
        ArrayList<Integer> lista = new ArrayList<>();// []

        //ugradjena metoda za ubacivanje elementa u listu
        lista.add(5); // [5]
        lista.add(7); //[5,7]
        lista.add(-1); // [5,7,-1]

        // lista.get(0); // .get(i) metoda vraca element sa pozicije i
        //lista.size(); // .size() metoda vraca koliko elemenata imamo u listi
        //lista.isEmpty(); //vraca true ukoliko je lista prazna
        //lista.remove(1); // .remove(i) brise element sa pozicije i
        // lista.contains(5); // vraca true ukoliko se element nalazi u listi
        //lista.add(1, 6); // na index 1 ubacujemo broj 6
        //lista.toArray();
        //System.out.println(lista);

        for(int i=0; i<3; i++) {
            System.out.println(lista.get(i));
        }

        for(Integer pivot:lista) { // i [5,7,-1], i=5
            //neki kod
            System.out.println(pivot);
        }




    }
}

