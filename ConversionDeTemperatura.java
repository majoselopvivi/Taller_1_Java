import java.util.Scanner;
public class ConversionDeTemperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese el valor de celsius: ");
        double celsius = sc.nextDouble();
       
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f%n", + celsius);
        System.out.printf("%.2f%n", + fahrenheit);
        System.out.printf("%.2f%n", + kelvin);

        sc.close();
    }
}
