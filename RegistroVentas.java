import java.util.Scanner;
public class RegistroVentas {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double [][] ventas = new double [4][3];

        for (int sucursal = 0; sucursal < 4; sucursal++){
            System.out.println("\nSucursal" + (sucursal + 1));

            for (int producto = 0; producto < 3; producto++){
                System.out.println("Ingrese venta del producto " + (producto + 1) + ": ");
                ventas[sucursal][producto] = sc.nextDouble();
            }
        }

        System.out.println("\n====Ventas por sucursal====");

        for (int sucursal = 0; sucursal < 4; sucursal++){
            double totalSucursal = 0;

            for (int producto = 0; producto < 3; producto++){
                totalSucursal = totalSucursal + ventas[sucursal][producto];
            }

            System.out.println("Sucursal " + (sucursal + 1) + ": $ " + totalSucursal);
        }

        System.out.println("\n====Ventas por producto====");

        for (int producto = 0; producto < 3; producto++){
            double totalProducto = 0;

            for (int sucursal = 0; sucursal < 4; sucursal++){
                totalProducto = totalProducto + ventas[sucursal][producto];
            }

            System.out.println("Producto " + (producto + 1) + ": $ " + totalProducto);
        }

        double maxVenta = ventas[0][0];
        int sucMax = 0;
        int prodMax = 0;

        for (int sucursal = 0; sucursal < 4; sucursal++){
            for (int producto = 0; producto < 3; producto++){
                if (ventas[sucursal][producto] > maxVenta){
                    maxVenta = ventas[sucursal][producto];
                    sucMax = sucursal;
                    prodMax = producto;
                }
            }
        }

        System.out.println("\nVenta mas alta: $ " + maxVenta + "Sucuersal: " + (sucMax + 1) + ", Producto: " + (prodMax + 1));

        sc.close();

    }
}
