package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio41 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Diguite  la edad de la persona:");
        int edad = leer.nextInt();
        double longitudCabello = edad * 12 * 0.5;
        double metrosCabello = longitudCabello / 100;
        System.out.println("La longitud del cabello de la persona es de aproximadamente " + metrosCabello + " metros.");
    }
    }
