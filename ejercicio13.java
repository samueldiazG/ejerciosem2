package ejercicio1;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("digite el primer numero");
        int num1 = leer.nextInt();
        System.out.println("digite el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("digite el tercer numero");
        int num3 = leer.nextInt();

        int ultdig1 = num1 % 10;
        int ultdig2 = num2 % 10;
        int ultdig3 = num3 % 10;

        System.out.println("el ultimo digito del primer numero es "+ultdig1);
        System.out.println("el ultimo digito del primer numero es "+ultdig2);
        System.out.println("el ultimo digito del primer numero es "+ultdig3);
    }
    
}
