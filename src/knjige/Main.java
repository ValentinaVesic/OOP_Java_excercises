package knjige;

public class Main {
    public static void main(String[] args) {
        Knjiga nova = new Knjiga("Senka vetra", 450, 1960, 650);
        nova.popust();
        nova.oldTimer();
        System.out.println(nova);
    }

}
