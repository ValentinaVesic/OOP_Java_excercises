package mreze;

public class Main {
    public static void main(String[] args) {
       DrustvenaMreza tiki = new Tiktok("Tiktok",400,10);
        tiki.zarada();
        tiki.upozorenje();
        System.out.println(tiki);

        DrustvenaMreza facebook = new Facebook("Facebook", 600,10);
        facebook.zarada();
        facebook.upozorenje();
        System.out.println(facebook);

        DrustvenaMreza instagram = new Instagram("Instagram", 600,10);
        instagram.zarada();
        instagram.upozorenje();
        System.out.println(instagram);
    }
}
