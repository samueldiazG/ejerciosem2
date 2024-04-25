package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio48 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("*********///**************");
        System.out.println("biemvenido a la calculadora");
        System.out.println("*********///**************");
        System.out.println("Diguite el primer número:");
        double num1 = leer.nextDouble();
        System.out.println("Diguite  el segundo número:");
        double num2 = leer.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
}
