package ejercicio1;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    int b,a;
    System.out.println("escriba la base del triangulo");
    b= leer.nextInt();
    System.out.println("escriba la altura del triangulo");
    a= leer.nextInt();
    int area = b*a/2;
    System.out.println("el area del triangulo:" + area);
    
}
}
