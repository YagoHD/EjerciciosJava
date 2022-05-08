import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta("Yago Ramos",75);
        //cuenta1.setTitular("Yago Ramos");
        //cuenta1.setCantidad(50000);
        
        System.out.println("Titular: "+ cuenta1.getTitular());
        System.out.println("Cantidad: " + cuenta1.getCantidad());
        
        System.out.println("Introduce la cantidad a retirar: ");
        double CantidadRetirar = sc.nextDouble();
        cuenta1.retirar(CantidadRetirar);
        System.out.println("Cantidad: " + cuenta1.getCantidad());
    }
}
