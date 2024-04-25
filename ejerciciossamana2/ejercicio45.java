package ejercicio1.ejerciciossamana2;

import java.util.Scanner;
public class ejercicio45 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("diguite el  numero");
        System.out.print(":");
        float num = scanner.nextFloat();

        int result;

        if (num < 0) {
            result = -1;
        } else if (num > 0) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println("El número " + num + " es: " + result);

        scanner.close();
    }
}