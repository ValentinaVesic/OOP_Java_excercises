package petak2;

public class kopiranjeNiza {
    public static void main(String[] args) {

        //Kopiranje nizova
        //Prilikom kopiranja nizova postoje dve varijante: duboko i plitko(kopiranje po referenci)
        // referenca - memorijska adresa

        int[] niz1 = {1,2,3,4};
        int[] niz2 = niz1; // plitko kopiranje

        //duboko kopiranje
        int[] niz3 = new int[niz1.length]; //{1,2,3,4}
        for(int i=0; i<niz1.length;i++) {
            niz3[i] = niz1[i];
        }
        //niz3 = {1,2,3,4}

    }
}
