import java.util.Scanner;
public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese numero b: ");
        int b = sc.nextInt();
        
        int cantidad = 0;
        int suma = 0;
        String listaPrimos = "";

        for (int numero = a; numero <= b; numero++) {

            if (numero < 2) {
                continue;
            }

            boolean esPrimo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(numero) && esPrimo) {

                if (numero % divisor == 0) {
                    esPrimo = false;
                }

                divisor = divisor + 1;
            }

            if (esPrimo) {
                listaPrimos = listaPrimos + numero + " ";
                cantidad = cantidad + 1;
                suma = suma + numero;
            }
        }

        System.out.println("Primos: " + listaPrimos);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}