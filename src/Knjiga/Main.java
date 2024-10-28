package Knjiga;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Knjiga k1 = new Knjiga("Knjiga", 101, 1995);
        Knjiga k2 = new Knjiga("Book", 800, 2005);
        Knjiga k3 = new Knjiga("Libro", 30, 2010);
        Knjiga k4 = new Knjiga("Buch", 65, 2015);
        Knjiga k5 = new Knjiga("Liber", 99, 2024);
        ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);
        listaKnjiga.add(k4);
        listaKnjiga.add(k5);


        Romanopisac romanopisac = new Romanopisac("Milance", 1989, listaKnjiga);
        Pesnik pesnik = new Pesnik("Dragance", 1988, listaKnjiga);
        Esejista esejista = new Esejista("Bojance", 1992, listaKnjiga);

        System.out.println("Najpoznatija knjiga ovog pisca je: " + romanopisac.najpoznatijaKnjiga());
        System.out.println("Vreme pisanja ovog pisca traje: " + romanopisac.vremePisanja() + " godina");
        romanopisac.dugometrazniRoman();
        System.out.println("Ovaj pesnik ima ovoliko zbirki: " + pesnik.brojZbirki());
        System.out.println("Ovaj esejista ima ovoliko eseja: " + esejista.kratkiEseji());
    }
}
