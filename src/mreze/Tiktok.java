package mreze;

public class Tiktok extends DrustvenaMreza {
    public Tiktok (String nazivDrustveneMreze, int brojKorisnika, int brojReklama) {
        super(nazivDrustveneMreze,brojKorisnika, brojReklama);
    }
    @Override
    public void upozorenje() {
        if (getBrojKorisnika() < 500) {
            System.out.println("Nema dovoljno korisnika.");
        }
    }
    }
    // Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko
    // ima manje od 500 korisnika.



