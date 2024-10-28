package ponedeljak;

public class svic {
    public static void main(String[] args) {

        int x = 1;

        switch(x){
            case 1:
                System.out.println("Vrednost x-a je jedan.");
                break;
            case 2:
                System.out.println("Vrednost x-a je dva.");
                break;
            default:
                System.out.println("Vrednost x-a nije ni jedan ni dva.");
                break;
        }
    }
}
