import java.util.Scanner;
public class ValidacionDeEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = -1;
        String etapa;
        
        while(edad < 1 || edad > 120){

            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();

            if(edad < 1 || edad > 120){
                System.out.println("Edad invalida, intente de nuevo");
            }
            
        }

        if(edad <= 12){
            etapa ="Niñez";
        }
        
        else if(edad <= 17){
            etapa = "Adolecencia";
        }
        
        else if (edad <= 25){
            etapa = "Juventud";
        }
        
        else if (edad <= 59){
            etapa = "Adultez";
        }

        else{
            etapa = "Tercera Edad";
        }

        System.out.println("Edad: " + edad);
        System.out.println("Etapa: " + etapa);
    
        sc.close();
        
    }
}
