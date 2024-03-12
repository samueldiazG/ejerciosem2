package ejercicio1;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese le costo total del producto");
        double c= leer.nextDouble();
        System.out.println("el iva de producto es de:"+(c*0.17));
    }
    
}
