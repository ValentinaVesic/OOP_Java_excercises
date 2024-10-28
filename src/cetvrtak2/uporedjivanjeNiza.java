package cetvrtak2;

public class uporedjivanjeNiza {
    public static void main(String[] args) {
        int[] niz1 = {1,2,3,4};
        int[] niz2 = {1,2,3,4};
        boolean isti   = true;
        if(niz1.length== niz2.length) {
            for (int i = 0; i<niz1.length; i++) {
                if(niz1[i]==niz2[i]) {
                    continue;
                } else {
                    isti = false;
                    break;
                }
            }
        }if (isti) {
            System.out.println("nizovi su jednaki.");
        } else {
            System.out.println("Nizovi nisu jednaki.");
        }
    }
}
