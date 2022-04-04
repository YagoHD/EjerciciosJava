
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.println("Introduce el numero al que comprobar si es divisible entre 2: ");
        x = sc.nextInt();
        
        if (x%2==0){
            System.out.println("El numero x="+x+" SI es divisible entre 2");
        }else{
            System.out.println("El numero x="+x+" NO es divisible entre 2");
        }
    }

}
