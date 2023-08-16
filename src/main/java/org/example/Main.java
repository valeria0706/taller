import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Integer opcion = 0;
        String nombrePeluche = "";
        Double precio = 0.0;
        Double precioiva = 0.0;

        do {
            System.out.println("Ingrese 1 para agregar el nombre del peluche y el precio sin IVA");
            System.out.println("Ingrese 2 para calcular el precio con IVA");
            System.out.println("Ingrese 3 para ver los datos del peluche");
            System.out.println("Ingrese 4 para editar el precio del peluche");
            System.out.println("Ingrese 5 para salir");

            opcion = keyboard.nextInt();

            switch (opcion) {
                case 1:
                    keyboard.nextLine();
                    System.out.println("Ingrese el nombre del peluche");
                    nombrePeluche = keyboard.nextLine();

                    System.out.println("Ingrese el precio sin IVA del peluche");
                    precio = keyboard.nextDouble();

                    break;

                case 2:
                    if (precio != 0.0) {
                        precioiva = precio * 1.19; // Se corrige el cálculo del IVA
                        System.out.println("El precio con IVA es " + precioiva);
                    } else {
                        System.out.println("Primero debe ingresar el precio del peluche.");
                    }
                    break;

                case 3:
                    System.out.println("Los datos del peluche son:\n" +
                            "Nombre del peluche: " + nombrePeluche + "\n" +
                            "Precio sin IVA: " + precio + "\n" +
                            "Precio con IVA: " + precioiva);
                    break;

                case 4:
                    System.out.println("Ingrese el nuevo precio");
                    precio = keyboard.nextDouble();
                    break;

                case 5:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        System.out.println("Adiós");
    }
}
