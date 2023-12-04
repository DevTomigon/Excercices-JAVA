package dia_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scanner = null;
        java.util.Scanner scanner = new Scanner(System.in);
        CalculadoraOperaciones calculadora = new Calculadora();
        CalculadoraConMenu calculadoraConMenu = new CalculadoraConMenu(calculadora, scanner);

        int opcion;

        do {
            System.out.println("---- Calculadora ----");
            System.out.println("1. Usar Calculadora");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadoraConMenu.mostrarMenuCalculadora();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
