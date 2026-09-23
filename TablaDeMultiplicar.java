import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", n * i);
        }

        System.out.println();

        for (int fila = 1; fila <= n; fila++) {

            for (int columna = 1; columna <= 12; columna++) {
                System.out.printf("%4d", fila * columna);
            }

            System.out.println();
        }

        sc.close();
    }
}
