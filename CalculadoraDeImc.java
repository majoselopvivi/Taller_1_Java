import java.util.Scanner;

public class CalculadoraDeImc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = sc.nextDouble();

        double imc = peso / (estatura * estatura);

        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc <= 24.9) {
            categoria = "Peso normal";
        } else if (imc <= 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.println("IMC: " + imc);
        System.out.println("Categoría: " + categoria);

        sc.close();
    }
}