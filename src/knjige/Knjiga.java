package knjige;

public class Knjiga {
    /*Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga*/

    private String naziv;
    private int brojStrana;
    private int godinaIzdanja;
    private double cena;

    public Knjiga(String naziv, int brojStrana,int godinaIzdanja, double cena){
        this.naziv=naziv;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
        this.cena=cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }



  //  -popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
    public void popust(){
        if(getBrojStrana()>300){
            setCena(getCena()*0.80);
        }
    }

    //-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga*/

    public void oldTimer(){
        if(2024-getGodinaIzdanja()>20){
            System.out.println("U pitanju je stara knjiga.");
        }
    }

    public String toString(){
        return "Knjiga " + getNaziv() + " kosta " + getCena();
    }
}
