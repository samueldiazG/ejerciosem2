package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio39 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el año de nacimiento:");
        int anoNacimiento = leer.nextInt();
        System.out.println("Digite su edad actual:");
        int anoActual = leer.nextInt();
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        int edad = anoActual - anoNacimiento;
        int diasDormidos = (int) (edad * 365 * 0.34);
        System.out.println(nombre + " ha dormido  " + diasDormidos + " días de su vida.");
    }
}
