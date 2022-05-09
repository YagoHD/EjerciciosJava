import java.util.Scanner;

public class NumeroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio=0, numeroVentas;
        
        System.out.println("Introduce numero de ventas: ");
        numeroVentas = sc.nextInt();
        int venta=0;
        for(int i=0; i<numeroVentas;i++){
            System.out.println("Introduce el precio de la venta: ");
            venta=sc.nextInt();
            precio=precio+venta;
        }
        System.out.println("Hay: "+numeroVentas+" ventas, con un precio total de: "+precio);
    }
}
