
import java.util.Scanner;

public class SoloPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Introduce un numero que sea mayor o igual a 0: ");
            numero = sc.nextInt(); 
        }while(numero<0);
        System.out.println("El numero introducido es: " + numero);
    }
}
