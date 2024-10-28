package Ucenik;

import java.util.ArrayList;

public class Srednjoskolac extends Ucenik{
    public Srednjoskolac(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        super(ime, fiksnaCenaSkolovanja, listaOcena, brojNeopravdanih);
    }

    @Override
    public double cenaSkolovanja() {
            double cenaSkolovanja = getFiksnaCenaSkolovanja()*1.25;
            return cenaSkolovanja;

    }
}
