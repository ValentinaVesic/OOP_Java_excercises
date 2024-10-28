package mreze;

public class Instagram extends DrustvenaMreza{
    public Instagram(String nazivDrustveneMreze, int brojKorisnika, int brojReklama) {
        super(nazivDrustveneMreze,brojKorisnika, brojReklama);
    }

    //Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku
    //I 10 po reklami.


    @Override
    public void zarada() {
        int zarada = (getBrojKorisnika() * 1) + (getBrojReklama() * 10);
        System.out.println("Zarada je " + zarada);
    }
}
