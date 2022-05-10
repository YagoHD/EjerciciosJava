import java.util.Scanner;

public class PideMayouque0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero mayor que 0: ");
        int numero = sc.nextInt();
        
        do{
            System.out.println("Introduce un numero MAYOR!!!! de 0: ");
            numero = sc.nextInt();
        }while (numero<=0);
    }
    
}
