package ponedeljak2;

public class zadatak2 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prima niz String-ova i jos jedan String, vraca true ukoliko se ta rec
        nalazi u tom nizu.

*/
        String[] prvi = {"kokakola", "malboro", "suzuki", "drugi string"};
        String drugi = "drugi string";
        boolean provera = proveraSadrzaja(prvi, drugi);
        System.out.println(provera);

    }

    public static boolean proveraSadrzaja(String[] prvi, String drugi) {

        boolean x = true;
        for (int i = 0; i < prvi.length; i++) {
            if (drugi.equals(prvi[i])) {
                x =  true;
            } else {
                x = false;
            }
        }
        return x;
    }
}
