package ejercicio1;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        double suma = num1 + num2 + num3;

        System.out.println("El doble del primer número es: " + (num1 * 2));
        System.out.println("El triple del segundo número es: " + (num2 * 3));
        System.out.println("El cuadrado del tercer número es: " + (num3 * num3));

        System.out.println("El promedio de los tres números es: " + promedio);
        System.out.println("La suma de los tres números es: " + suma);
}
