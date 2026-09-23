import java.util.Scanner;
public class CalculoNomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el valor de horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.println("Ingrese el valor de la hora: ");
        double valorHoras = sc.nextDouble();

        double salarioBruto = horas * valorHoras;
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSS - retencion;

        System.out.println("Empleadop: " + nombre);
        System.out.println("Horas trabajadas: "+ horas);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Descuento SS (8%): " + descuentoSS);
        System.out.println("Retencion (5%): " + retencion);
        System.out.println("Salario Neto: "   + salarioNeto);

        sc.close();
        
    }
}
