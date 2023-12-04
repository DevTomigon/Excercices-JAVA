package dia_4;

import java.util.Scanner;

public class CalculadoraConMenu implements CalculadoraMenu {
    private final CalculadoraOperaciones calculadoraOperaciones;

    public CalculadoraConMenu(CalculadoraOperaciones calculadoraOperaciones, Scanner scanner) {
        this.calculadoraOperaciones = calculadoraOperaciones;
    }

    @Override
    public void mostrarMenuCalculadora(Scanner scanner) {
    }

    @Override
    public void mostrarMenuCalculadora() {
        int opcion;

        do {
            System.out.println("---- Menú de Calculadora ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opción deseada: ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadoraOperaciones.realizarSuma(scanner);
                    break;
                case 2:
                    calculadoraOperaciones.realizarResta(scanner);
                    break;
                case 3:
                    calculadoraOperaciones.realizarMultiplicacion(scanner);
                    break;
                case 4:
                    calculadoraOperaciones.realizarDivision(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                    break;
            }

        } while (opcion != 0);
    }

    @Override
    public void ejecutarOperacion() {
        // Puedes agregar lógica específica de ejecutarOperacion aquí si es necesario
    }
}