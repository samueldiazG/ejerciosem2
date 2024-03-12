package ejercicio1;
import java.util.Scanner;
public class ejercico11 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la bse del rectanglo");
        int b =leer.nextInt();
        System.out.println("ingrese el alto del rectangulo");
        int h = leer.nextInt();
        int area= b*h;
        System.out.println("el area del rectangulo es: "+area);
        

    }
    
}
