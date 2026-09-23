import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear matriz tablero[3][3]
        char[][] tablero = new char[3][3];

        // Llenar con espacios en blanco
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }

        int turno = 1;
        boolean hayGanador = false;
        boolean tableroLleno = false;
        char simbolo = ' ';

        // MIENTRAS NO hayGanador Y NO tableroLleno
        while (!hayGanador && !tableroLleno) {

            // Elegir X u O
            simbolo = (turno == 1) ? 'X' : 'O';

            // Mostrar tablero
            System.out.println("\nTablero:");

            for (int fila = 0; fila < 3; fila++) {

                System.out.println(
                    tablero[fila][0] + " | " +
                    tablero[fila][1] + " | " +
                    tablero[fila][2]
                );

                if (fila < 2) {
                    System.out.println("--+---+--");
                }
            }

            System.out.println("Turno del jugador " + simbolo);

            // HACER
            int fila;
            int columna;
            boolean celdaValida;

            do {

                System.out.print("Ingrese fila (0-2): ");
                fila = sc.nextInt();

                System.out.print("Ingrese columna (0-2): ");
                columna = sc.nextInt();

                // Revisar si la celda es válida
                if (fila >= 0 && fila <= 2 &&
                    columna >= 0 && columna <= 2 &&
                    tablero[fila][columna] == ' ') {

                    celdaValida = true;

                } else {

                    celdaValida = false;
                    System.out.println("Celda inválida, intenta de nuevo");
                }

            } while (!celdaValida);

            // Colocar símbolo
            tablero[fila][columna] = simbolo;

            // =========================
            // REVISAR SI HAY GANADOR
            // =========================

            // Revisar filas
            for (int i = 0; i < 3; i++) {

                if (tablero[i][0] == simbolo &&
                    tablero[i][1] == simbolo &&
                    tablero[i][2] == simbolo) {

                    hayGanador = true;
                }
            }

            // Revisar columnas
            for (int i = 0; i < 3; i++) {

                if (tablero[0][i] == simbolo &&
                    tablero[1][i] == simbolo &&
                    tablero[2][i] == simbolo) {

                    hayGanador = true;
                }
            }

            // Revisar diagonal principal
            if (tablero[0][0] == simbolo &&
                tablero[1][1] == simbolo &&
                tablero[2][2] == simbolo) {

                hayGanador = true;
            }

            // Revisar diagonal secundaria
            if (tablero[0][2] == simbolo &&
                tablero[1][1] == simbolo &&
                tablero[2][0] == simbolo) {

                hayGanador = true;
            }

            // =========================
            // REVISAR SI TABLERO ESTÁ LLENO
            // =========================

            tableroLleno = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (tablero[i][j] == ' ') {
                        tableroLleno = false;
                    }
                }
            }

            // Cambiar de jugador
            if (!hayGanador) {
                turno = (turno == 1) ? 2 : 1;
            }
        }

        // Mostrar tablero final
        System.out.println("\nTablero final:");

        for (int fila = 0; fila < 3; fila++) {

            System.out.println(
                tablero[fila][0] + " | " +
                tablero[fila][1] + " | " +
                tablero[fila][2]
            );

            if (fila < 2) {
                System.out.println("--+---+--");
            }
        }

        // Resultado
        if (hayGanador) {
            System.out.println("Ganó el jugador " + simbolo);
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }
}