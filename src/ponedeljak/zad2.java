package ponedeljak;

public class zad2 {

    public static void main(String[] args) {
        /*Istampati sve brojeve 1-20 koji su deljivi sa 2 i 3.
         */
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Brojevi su: " + i);
            }
        }
    }
}
