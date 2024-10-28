package studenti;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(5);
        listaOcena.add(1);
        listaOcena.add(1);
        student st = new student("Marko", listaOcena);

        System.out.println(st);
    }
}
