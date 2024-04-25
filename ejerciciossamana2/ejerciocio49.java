package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejerciocio49 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un texto:");
    String texto = leer.nextLine();
    char primeraLetra = obtenerPrimeraLetra(texto);
    System.out.println("La primera letra de la cadena es: " + primeraLetra);
    }
    public static char obtenerPrimeraLetra(String texto) {
        return texto.charAt(0);
    }
}
