
import java.util.Scanner;

public class MuestraAscii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero para descifrar caracter ASCII: ");
        int x= sc.nextInt();
        
        char caracter=(char)x; 
        System.out.println(caracter);
        
        
        System.out.println("Introduce un caracter ASCII");
        caracter = sc.next().charAt(0);
 
        //Pasamos el caracter a codigo
        int codigo = (int) caracter;
 
        System.out.println(codigo);
    }
}
