package cetvrtak2;

public class zadatak3  {
    public static void main(String[] args) {
        /*Napraviti niz brojeva i prebrojati Koliko ima brojeva koji su deljivi sa 3.
*/
        int[] niz = {3,6,10,98,75,16,25,48,33,59};
        int brojac = 0;
        System.out.println("Brojevi iz niza deljivi sa 3 su: ");

        for (int i =0; i<niz.length;i++ ) {
            if (niz[i]%3==0){
                brojac++;
            }

        }System.out.println(brojac);
    }
}
