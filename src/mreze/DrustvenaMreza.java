package mreze;

public class DrustvenaMreza {
    /*Zadatak 1:
Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
Napraviti metodu:
- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika
(manje od 200)
Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku
I 10 po reklami.
Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko
ima manje od 500 korisnika.*/

    private int brojKorisnika;
    private int brojReklama;
    private String nazivDrustveneMreze;

    public DrustvenaMreza(String nazivDrustveneMreze, int brojKorisnika, int brojReklama) {
        this.nazivDrustveneMreze=nazivDrustveneMreze;
        this.brojKorisnika = brojKorisnika;
        this.brojReklama = brojReklama;
    }

    public String getNazivDrustveneMreze(){
        return nazivDrustveneMreze;
    }

    public int getBrojKorisnika() {
        return brojKorisnika;
    }

    public int getBrojReklama() {
        return brojReklama;
    }


    // -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
    public void zarada() {
        int zarada = (getBrojKorisnika() * 2) + (getBrojReklama() * 5);
        System.out.println("Zarada " + getNazivDrustveneMreze() + " je:" + zarada);
    }
//-> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika
//            (manje od 200)
   public void upozorenje(){
        if (getBrojKorisnika()<200){
            System.out.println(getNazivDrustveneMreze()+ " nema dovoljno korisnika.");
        }
   }

   public String toString(){
        return "Drustvena mreza" + getNazivDrustveneMreze() +" ima " + getBrojKorisnika() + " korisnika i " + getBrojReklama() + " reklama.";
   }

}
