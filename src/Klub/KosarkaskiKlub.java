package Klub;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    //- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.

    public String sampionTima(){
        String sampion = "";
        for (Igrac i:getListaIgraca()){
            if(i.getBrojPostignutihpoena()>1000){
                sampion=i.getIme();
            }
        }
        return sampion;
    }

    @Override
    public void vrednosttima() {
        int vrednost = 0;
        for (Igrac i:getListaIgraca()){
            vrednost=i.getBrojPostignutihpoena()*50;
        }
        System.out.println("Vrednost tima je " + (vrednost*getListaIgraca().size()));

    }
}
