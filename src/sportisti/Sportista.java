package sportisti;

public class Sportista {

    private String ime;
    private int brojNagrada;
    private int godinaRodjenja;


    public Sportista(String ime, int brojNagrada, int godinaRodjenja){
        this.ime = ime;
        this.brojNagrada = brojNagrada;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getIme(){
        return ime;

    }

    public void setIme(String novoIme){
        this.ime = novoIme;
    }

    public int getBrojNagrada(){
        return brojNagrada;
    }

    public void setBrojNagrada(int noviBrojNagrada){
        this.brojNagrada=noviBrojNagrada;

    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int novaGodinaRodjenja) {
        this.godinaRodjenja = novaGodinaRodjenja;
    }

    //- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina

    public void veteran(){
        int trenutnaGodina = 2024;
        int godineSportiste = trenutnaGodina - getGodinaRodjenja();

        if (godineSportiste>40){
            System.out.println(getIme() + " je veteran.");
        } else {
            System.out.println(getIme() + " nije veteran.");
        }
    }

 /*   public String toString(){
        return "Ime sportiste je: " + getIme() + ", rodjen je: " + getGodinaRodjenja() + veteran();
    }*/
}
