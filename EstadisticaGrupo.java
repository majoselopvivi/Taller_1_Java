import java.util.Scanner;
public class EstadisticaGrupo {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        double [] notas = new double [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;

        double masAlta = notas[0];
        int posAlta = 0;

        double masBaja = notas[0];
        int posBaja = 0;

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < 10; i++) {
            suma = suma + notas[i];

            if (notas[i] > masAlta) {
                masAlta = notas[i];
                posAlta = i;
            }

            if (notas[i] < masBaja) {
                masBaja = notas[i];
                posBaja = i;
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma/10;

        System.out.println("\n====RESULTADOS====");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mas alta: " + masAlta + " Posicion: " + posAlta);
        System.out.println("Nota mas baja: " + masBaja + " Posicion: " + posBaja);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}
