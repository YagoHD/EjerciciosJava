
public class NumerosDivsibles {

    public static void main(String[] args) {
        
//SE BUSCAN NUMEROS QUE SEAN DIVISIBLES ENTRE 2 Y 3

        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0 && x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
