package ejercicio1;
import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("igrese el segundo numero");
        int num2 = leer.nextInt();
        if (num1<num2) {
            System.out.println("el primer numero es menor "+","+"el segundo numero es mayor");
            
        } else {
            System.out.println("el segundo numero es mayor"+","+"el primer numero es menor");
            
        }
            
        }
    }
    
