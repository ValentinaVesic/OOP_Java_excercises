package ponedeljak2;

public class zadatak3 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prima neki niz brojeva i racuna sumu svih parnih brojeva.
*/
       int [] niz = {1,2,3,4};
       int x = 0;
       int sumaParnih = sumaParnihBrojevaUNizu(niz,x);
        System.out.println(sumaParnih);
    }
    public static int sumaParnihBrojevaUNizu (int []niz, int sumaBrojeva) {

        for (int i = 0; i<niz.length; i ++) {
            if (niz[i]%2 == 0){
                sumaBrojeva+=niz[i];
            }
        }
        return sumaBrojeva;
    }

}
