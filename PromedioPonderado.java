import java.util.Scanner;
public class PromedioPonderado {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double p1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double p2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double p3 = sc.nextDouble();

        double definitiva = (p1 * 0.30) + (p2 * 0.30) + (p3 * 0.40);

        String estado = (definitiva >= 3.0)? "Aprobado " :  "Reprobado";

        System.out.printf("Definitiva: %.2f%n", definitiva);
        System.out.print("Estado: " + estado);

        sc.close();
    }
}
