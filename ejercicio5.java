package ejercicio1;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("Bienvenido a para conmenzar, proporcione los siguientes datos");
        System.out.println("**************************************************************");
        System.out.println("Ingrese el diagonal mayor del rombo ");
        double diagonalmy = leer.nextDouble();
        System.out.println("Ingrese el diagonal menor del rombo ");
        double diagonalmn = leer.nextDouble();
        double area = diagonalmy * diagonalmn /2;
        System.out.println("El area del rombo es:"+area);
        
    }
}
