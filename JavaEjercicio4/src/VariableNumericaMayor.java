
public class VariableNumericaMayor {
    public static void main(String[] args) {
        int x=3, y=3;
        
        if (x>=y){
            if(x==y){
                System.out.println("Los numeros "+x+" y "+y+" son iguales");
            }else{
                System.out.println("El numero "+x+" es mayor que "+y);
            }
        }else{
            System.out.println("El numero "+y+" es mayor que "+x);
        }
    }
}
