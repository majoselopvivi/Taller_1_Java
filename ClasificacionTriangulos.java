import java.util.Scanner;

public class ClasificacionTriangulos {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el valos de a: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el valor de c: ");
        int c = sc.nextInt();

        boolean esValido = (a + b > c) && (a + c > b ) && (b + c > a);
        if (!esValido){
            System.out.println("No es un triángulo valido");
        }
        if (a == b && b == c){
            System.out.println("Equilatero");
        }
        else if (a == b || b == c || a == c){
            System.out.println("Isoceles");
        }
        else{
            System.out.println("Escaleno");
        }
        sc.close();
        }
    
}
