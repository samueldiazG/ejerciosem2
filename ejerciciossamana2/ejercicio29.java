package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio29 {
    public static float cubos(float numero) {
        return numero*numero*numero;
    }
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese cualquier numero");
    float numero = leer.nextFloat();
    float resultado = cubos(numero);
    

    }
}
