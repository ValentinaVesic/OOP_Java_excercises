package petakdoc;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {

        /*
        Zadatak 1:
Napraviti listu i ubaciti u nju sve parne brojeve koji su deljivi sa 3.
         */

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1;i<=30;i++) {
            if(i%3==0 && i%2==0) {
                lista.add(i);
            }
        }

        System.out.println(lista);

        //izbaci elemente koji su deljivi sa 4
        for(int i=0; i<lista.size();i++) {
            if(lista.get(i)%4==0) {
                lista.remove(i);
            }
        }
        System.out.println(lista);
    }
}