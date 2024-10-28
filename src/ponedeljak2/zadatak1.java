package ponedeljak2;

public class zadatak1 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prima niz brojeva i kao rezultat vraca najveci broj iz tog niza.
*/
        int[] niz = {150,2,9,4,5};
        int maximum = pronadjiMaksimum(niz);
        System.out.println(maximum);

    }
    public static int pronadjiMaksimum(int[] niz){
        int max = niz[0];
        for (int i = 1;i<niz.length;i++){
            if(niz[i]>max){
                max = niz[i];

            }
        }
        return max;
    }
}
