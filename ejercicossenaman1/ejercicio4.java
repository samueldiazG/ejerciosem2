package ejercicio1;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Dijite el radio del circulo");
        double ra = leer.nextDouble();
        double area = Math.PI * Math.pow(ra,2);
        System.out.println("El area del circulo es de :"+ area);

    }
    
}
