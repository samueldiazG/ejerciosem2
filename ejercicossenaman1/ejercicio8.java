package ejercicio1;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        double num1=leer.nextDouble();
        System.out.println("ingrese el segundo numero");
        double num2=leer.nextDouble();
        double r= num1/num2;
        System.out.println("El resultado de la divison es:"+r);

    }
    
}
