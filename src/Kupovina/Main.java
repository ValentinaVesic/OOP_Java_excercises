package Kupovina;

public class Main {
    public static void main(String[] args) {

        Stavka s = new Stavka("TV", 1000);
        KreditnaKartica k = new KreditnaKartica(2000);
        Korpa k1 = new OnlineKorpa(s,k);

        k1.plati();
        System.out.println(k1);
    }
}
