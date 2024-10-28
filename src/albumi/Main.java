package albumi;

public class Main {
    public static void main(String[] args) {
        Muzicar novi = new PopMuzicar("Album",1997,20,"Majkl Dzekson",1996);
        novi.zarada();
        novi.prviHit();
        System.out.println(novi.zarada());
    }
}
