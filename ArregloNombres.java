import java.util.Scanner;
public class ArregloNombres {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String[] pacientes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }

        System.out.println("\nIngrese el nombre del paciente a buscar: ");
        String nombreBuscado = sc.nextLine();

        int posicion = -1;

        for (int i = 0; i < 8; i++) {
            if (pacientes[i].equalsIgnoreCase(nombreBuscado)){
                posicion = i;
                break;
            }
        }

        if (posicion != -1){
            System.out.println("Paciente encontrado en la posicion " + posicion);
        } else {
            System.out.println("Paciente no encontrado.");
        }

        sc.close();
    }
}
