package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio47 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("diguite la cantidad comprada:");
    int cantidadComprada = leer.nextInt();
    System.out.println("Diguite  el precio de la compra:");
    double precioCompra = leer.nextDouble();
    System.out.println("Diguite el precio pagado:");
    double precioPagado = leer.nextDouble();
    double descuento = ((precioCompra - precioPagado) / precioCompra) * 100;
    System.out.println("El porcentaje para el descuento aplicado es: " + descuento + "%");

}
}
