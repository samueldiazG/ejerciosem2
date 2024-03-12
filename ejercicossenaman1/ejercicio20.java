package ejercicio1;
import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        
    }
    Scanner scanner = new Scanner(System.in);

        double suma = 0;
        double promedio;
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        promedio = suma / 5;

        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);

        System.out.println("El doble de las notas es:");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i] * 2);
        }
}

