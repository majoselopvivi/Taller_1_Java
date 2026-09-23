import java.util.Scanner;
public class AreaFiguras {
    public static void main (String [] args) { 
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Cual es la base del rectangulo?");
        double base = sc.nextDouble();

        System.out.println("¿Cual es la altura del rectangulo?");
        double altura = sc.nextDouble();

        System.out.println("¿Cual es el radio del circulo?");
        double radio = sc.nextDouble();

        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);
        double areaCirculo = 3.14 * radio * radio;
        double circunferencia = 2 * 3.14 * radio;

        System.out.println("El area del rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
        System.out.println("El are del circulo es: " + areaCirculo);
        System.out.println("La circunferencia del circulo es: " + circunferencia);

        sc.close();


    }
}
