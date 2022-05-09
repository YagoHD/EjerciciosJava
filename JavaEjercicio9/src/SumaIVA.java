import java.util.Scanner;

public class SumaIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del preoducto: ");
        double precio = sc.nextDouble();
        double IVA=0.21;
        
        double precioIVA = precio + (precio*IVA);
        System.out.println("El precio con IVA es: "+ precioIVA);
    }
}
