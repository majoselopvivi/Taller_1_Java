import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int n;

        do {
            System.out.print("Adivina el numero entre (1 y 100): ");
            n = sc.nextInt();

            intentos += 1;

            if (n < secreto) {
                System.out.println("Intento" + " " + intentos +":" + " " + "El numero es mayor");
            }
            else if (n > secreto) {
                System.out.println("Intento" + " " + intentos +":" + " " +"El numero es menor");
            }
            else {
                System.out.println("¡Correcto! Lo lograste en " + intentos + " " + "Intentos"  );
            }

        } while (n != secreto);

        sc.close();
    }
}