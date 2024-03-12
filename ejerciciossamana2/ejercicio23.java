package ejercicio1.ejerciciossamana2;
import java.util.Random;
import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Random ale = new Random();
        int[] numero = new int [3];
        for (int i = 0; i< numero.length;i++);
        int i;
        numero[i]= ale.nextInt(10);
        for (int j = 0; j < i; j++) {
            if (numero[i] == numero[j]) {
                i--;
                break;
            
        }
    }
}



public static void juego(String[] args) {
    System.out.println("");
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            intentos++;
            System.out.print("Introduce tu intento (3 números separados por espacios): ");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

            if (inputArray.length != 3) {
                System.out.println("Por favor, introduce exactamente 3 números.");
                continue;
            }

            int[] guess = new int[3];
            for (int i = 0; i < 3; i++) {
                guess[i] = Integer.parseInt(inputArray[i]);
            }

            int[] numero;
            String pista = obtenerPista( numero, guess);
            System.out.println(pista);

            if (pista.equals("Verde Verde Verde")) {
                System.out.println("¡Felicidades! Has adivinado los números en " + intentos + " intentos.");
                break;
            }
        }
}
    public static String obtenerPista(int[] numerosGenerados, int[] intento) {
        StringBuilder pista = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (numerosGenerados[i] == intento[i]) {
                pista.append("Verde ");
            } else if{ (numerosGenerados[i] == intento[0] || numerosGenerados[i] == intento[1] || numerosGenerados[i] == intento[2]) {
                pista.append("Amarillo ");
            } else {
                pista.append("Rojo ");
            }
        
        return pista.toString().trim();
            }
        }
}







