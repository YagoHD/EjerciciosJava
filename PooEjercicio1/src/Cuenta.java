/*
1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
Crea sus métodos get, set y toString.
Tendrá dos métodos especiales:
ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
public class Cuenta {
    private double cantidad;
    private String titular;

    //Constructores
    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }    
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void ingresar(double ingreso){
        if (ingreso>0){
            cantidad=cantidad+ingreso;
        }else{
            cantidad=cantidad;
        }
    }
    
    public void retirar(double retiro){
        if (cantidad<retiro){
            cantidad=0;
        }else{
            cantidad=cantidad-retiro;
        }
    }

    @Override
    public String toString() {
        return "El titular:" +titular+ "tine: " + cantidad + " € en la cuenta";
    }
    
    
}
