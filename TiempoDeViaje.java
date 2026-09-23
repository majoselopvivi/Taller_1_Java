import java.util.Scanner;
public class TiempoDeViaje {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        int segundosTotales = minutos * 60;
        int horas = minutos / 60;
        int minResto = minutos % 60;
        int segResto = segundosTotales % 60;

        System.out.println("las horas: " + horas);
        System.out.println("Los minResto son: " + minResto);
        System.out.println("Los segResto son: " + segResto);
        System.out.println("Los segundosTotales son: " + segundosTotales);

        sc.close();

     }
    
}
