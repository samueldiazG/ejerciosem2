package ejercicio1.ejerciciossamana2;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el cateteto#1");
        int cat1=leer.nextInt();
        System.out.println("ingrese el cateteto#2");
        int cat2= leer.nextInt();
        int cate1pn= cat1*cat1;
        int cate2pn= cat2*cat2;
        int hip = cate1pn*cate2pn;
        System.out.println("la hipotenusa del triangulo es :"+hip+"^"+2);
    }

}
