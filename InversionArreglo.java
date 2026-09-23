import java.util.Scanner;
public class InversionArreglo {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del arreglo");
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("El tamaño del arreglo debe estar entre 1 y 20. ");
        } else {

            int[] arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el elemento" + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }

            System.out.println("\nArreglo original: ");
            for (int i = 0; i < n; i++) {
               System.out.println(arreglo[i] + " ");
            }

            for (int i = 0; i < n / 2; i++) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[n - 1 - i];
                arreglo[n - 1 - i] = temp;
            }

            System.out.println("\n\nArreglo invertido: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arreglo[i] + " ");
            }

        }


        sc.close();
    }
}
