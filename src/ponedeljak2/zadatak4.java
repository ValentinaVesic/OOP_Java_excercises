package ponedeljak2;

import org.w3c.dom.ls.LSOutput;


public class zadatak4 {
    public static void main(String[] args) {
        /*Napraviti metodu koja prima niz Stringova i vraca najduzi String iz niza.
*/
        String [] string = {"Cipi","capa","dubi","dabadabada"};
        String najduzi = najduziStringUNizu(string);
        System.out.println(najduzi);
    }

    public static String najduziStringUNizu (String [] niz){
        String max = niz[0];
        for (int i = 1; i< niz.length; i++){
            if (max.length()<niz[i].length()){
                max=(niz[i]);
            }
        }
        return max;
    }
}
