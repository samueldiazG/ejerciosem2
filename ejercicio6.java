package ejercicio1;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,d=3,e=0,r;
        for(int i=1;i<=d;i++){
        System.out.println("ingrese un numero "+i);
        a=leer.nextInt();
        e+=a;
    }
        r=e/3;
        System.out.println("La media aritmetica es:"+r);

        
    }
    
}
