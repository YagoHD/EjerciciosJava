import java.util.Scanner;

public class Contrasenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra="Racamalaca1.", contraIntroducida;
        int contador=0;
        
        System.out.println("Introduce la contraseña: ");
        contraIntroducida = sc.nextLine();
        
        if (contra.equals(contraIntroducida)){
            System.out.println("Bienvenido");
        }else{
            contador++;
            do {
                System.out.println("Error introduce la contraseña de nuevo: ");
                contraIntroducida = sc.nextLine();
                if (contra.equals(contraIntroducida)){
                    System.out.println("Bienvenido");
                    break;
                }
                contador++;
            } while (contador<3);        
        }
    }
}
