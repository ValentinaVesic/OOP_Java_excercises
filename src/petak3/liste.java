package petak3;

import java.util.ArrayList;

public class liste {
    public static void main(String[] args) {
      /*  ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(7);
        lista.add(-1);

        lista.get(0); // get (i) vraca element sa pozicije i
        lista.size(); // size() vraca koliko elemenata imamo u listi
        lista.isEmpty(); // true ako ima makar jedan element
        lista.remove(5); // brise elemenat sa pozicije i
        lista.contains(5); // vraca true ako se elemenat nalazi u listi
        lista.add(1,6); // dodaje element na odredjenoj poziciji i
        */

        //a)Napraviti listu brojeva od 1 do 50 koji su deljivi sa 7.
        //b)Proci kroz tu listu i izbaciti sve elemente koji su deljivi sa 3.

        ArrayList<Integer> lista1 = new ArrayList<>();

        for (int i = 0; i<50;i++){
            if(i%7==0){
                lista1.add(i);
            }
        }
        System.out.println(lista1);

        for (int i = 0; i< lista1.size();i++){
            if (lista1.get(i)%3==0){
                lista1.remove(i);
            }

        }

        System.out.println(lista1);


    }
}
