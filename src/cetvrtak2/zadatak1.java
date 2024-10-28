package cetvrtak2;

public class zadatak1 {
    public static void main(String[] args) {
        /*Napraviti niz brojeva i stampati samo parne.
*/
        int[] niz = {1,2,3,4,5,6};
        System.out.println("Parni brojevi su: ");

        for (int i = 0; i< niz.length; i++)
        { if (niz[i]%2==0){
            System.out.println(niz[i]);
        }

        }

    }
}
