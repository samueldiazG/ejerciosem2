package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio34 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite  el toltal de la compra:");
        double montoCompra = leer.nextDouble();
        double descuento = 0;
        if (montoCompra > 1000) {
            descuento = montoCompra * 0.10;
        } else if (montoCompra > 500 && montoCompra <= 1000) {
            descuento = montoCompra * 0.20;
        }
        double montoFinal = montoCompra - descuento;
        System.out.println("El descuento aplicado es: $" + descuento);
        System.out.println("El monto final a pagar es: $" + montoFinal);
    }
}

