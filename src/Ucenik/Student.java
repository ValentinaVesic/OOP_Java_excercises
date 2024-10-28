package Ucenik;

import java.util.ArrayList;

public class Student extends Ucenik{
    public Student(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        super(ime, fiksnaCenaSkolovanja, listaOcena, brojNeopravdanih);
    }

    @Override
    public double cenaSkolovanja() {
            double cenaSkolovanja = getFiksnaCenaSkolovanja()*1.30;
            return cenaSkolovanja;

    }
}
