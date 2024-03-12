package ejercicio1;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero de cuatro cifras ");
        int num = leer.nextInt();
        int digito1 = num / 1000;
        int digito2 = (num % 1000) / 100;
        int digito3 = (num % 100) / 10;
        int digito4 = num % 10;
        if (num<1000) {
            System.out.println("el numero no tiene cuatro cifras ");
            
        } else {
            int suma = digito1 + digito2 + digito3 + digito4;
        
            System.out.println("La suma de los dígitos es: " + suma);
            
        }
    }
    
}
