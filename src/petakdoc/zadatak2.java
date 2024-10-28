package petakdoc;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {

        /*
        Zadatak 2:
a)Napraviti listu brojeva od 1 do 50 koji su deljivi sa 7.
b)Proci kroz tu listu i izbaciti sve elemente koji su deljivi sa 3.
         */

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1; i<=50; i++) {
            if(i%7==0) {
                lista.add(i);
            }
        }
        System.out.println(lista);

        for(int i=0;i<lista.size();i++) {
            if(lista.get(i)%3==0) {
                lista.remove(i);
            }
        }

        System.out.println(lista);

    }
}
