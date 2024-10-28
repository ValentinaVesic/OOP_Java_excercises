package ponedeljak2;

public class zadatak5 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prima dva niza istih duzina i sabire ih.*/
    int [] niz1 = {5,6,7};
    int [] niz2 = {1,2,3};
    int [] niz3 = treciNiz(niz1, niz2);
    stampanjeNiza(niz3);
    }
    public static int [] treciNiz (int [] niz1, int [ ] niz2)
    {
        int [ ] treciNiz = new int [niz1.length];
        for (int i = 0; i<niz1.length;i++){
        treciNiz[i] = niz1[i] + niz2[i];
        }
        return treciNiz;
    }

    public static void stampanjeNiza (int [] niz){
        for (int i = 0; i<niz.length; i++){
            System.out.println(niz[i]);
        }
    }


}
