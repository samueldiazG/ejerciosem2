package ejercicio1;
import java.util.Scanner;
public class ejercico19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el sueldo básico del empleado: ");
        double sueldoBasico = scanner.nextDouble();

        System.out.print("Introduce el monto por horas extras: ");
        double horasExtras = scanner.nextDouble();

        double totalGanado = sueldoBasico + horasExtras;

        double descuento = 0.20 * totalGanado;
        totalGanado -= descuento;

        System.out.println("Sueldo básico: " + sueldoBasico);
        System.out.println("Total del descuento: " + descuento);
        System.out.println("Total ganado: " + totalGanado);
    }
    
}
