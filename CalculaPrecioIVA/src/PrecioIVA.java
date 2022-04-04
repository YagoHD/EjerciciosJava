import java.util.Scanner;
public class PrecioIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 21;
        
        System.out.print("Introduce precio sin IVA: ");
        double precio = sc.nextDouble();
        double precioIVA = precio + precio*(IVA/100);
        System.out.print("EL precio con IVA es de: ");
        System.out.format("%.2f ", precioIVA);
        System.out.println("");
    }
}
