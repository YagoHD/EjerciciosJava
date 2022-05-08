import java.util.Scanner;

public class EsDivisibleEntre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        
        if (numero%2==0){
            System.out.println(numero+" Es divisible entre 2");
        } else{
            System.out.println(numero+" No es divisible entre 2");
        }
    }
}
