package petak2;

public class metode {
    public static void main(String[] args) {
        int x = 11;
        int y = 12;
        int c = 13;
        int d = 15;
        sabiranje2(x, y);
        int sabiranje11 = sabiranje(y, c);
        int sabiranje12 = sabiranje(c, d);
        int oduzimanje = oduzimanje(x,y);
        System.out.println(oduzimanje);


    }

    public static int sabiranje(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void sabiranje2(int a, int b) {
        int c = a + b;
        System.out.println("Rezultat je " + c);
        return;}


        public static int oduzimanje ( int l, int m){
            int i = l - m;
            return i;}



        }





