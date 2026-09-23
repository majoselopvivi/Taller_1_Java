import java.util.Scanner;
public class TarifaDeParqueadero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (1, 2 o 3): ");
        int tipo = sc.nextInt();

        System.out.print("Ingrese las horas: ");
        int horas = sc.nextInt();

        int primeraHora = 0;
        int horaAdicional = 0;

        switch (tipo) {

            case 1:
                primeraHora = 2000;
                horaAdicional = 1500;
                break;

            case 2:
                primeraHora = 4000;
                horaAdicional = 3000;
                break;

            case 3:
                primeraHora = 5000;
                horaAdicional = 4000;
                break;

            default:
                System.out.println("Tipo de vehículo no válido");
                return;
        }

        int total = primeraHora + (horaAdicional * (horas - 1));

        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}

