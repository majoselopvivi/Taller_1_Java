import java.util.Scanner;
public class SistemaCalificaciones {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

       System.out.println("Ingrese la nota (0.0 - 5.0): ");
       double notas = sc.nextDouble();

       if (notas < 0.0 || notas > 5.0){
        System.out.println("Nota invalida");
       } else {

        char letra;
        String descripcion;

        if (notas >= 4.6) {
            letra = 'A';
            descripcion = "Excelente";
        } else if (notas >= 4.0) {
            letra = 'B';
            descripcion = "Sobresaliente";
        } else if (notas >= 3.5) {
            letra = 'C';
            descripcion = "Aceptable";
        } else if (notas >= 3.0) {
            letra = 'D';
            descripcion = "Aprobado minimo";
        } else {
            letra = 'F';
            descripcion = "Reprobado";
        }

        System.out.println("Nota: " + notas);
        System.out.println("Letra: " + letra);
        System.out.println("Descripcion: " + descripcion);
       }

       sc.close();
    }

}
