package dia_5;

import java.util.Scanner;

public class Boliche implements GestorBoliche {
    private final int capacidadMaxima = 500;
    private int capacidadDisponible = capacidadMaxima;
    private double dineroRecaudado = 0;

    @Override
    public void mostrarCapacidadDisponible() {
        System.out.println("Capacidad disponible: " + capacidadDisponible + " personas");
    }

    @Override
    public void mostrarDineroRecaudado() {
        System.out.println("Dinero recaudado: $" + dineroRecaudado);
    }

    @Override
    public void ingresarDatos(Scanner scanner) {

    }

    @Override
    public void gestionarIngreso() {

    }

    @Override
    public void mostrarMenu() {
        System.out.println("--- Menú del Boliche ---");
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Capacidad disponible");
        System.out.println("3. Dinero recaudado");
        System.out.println("0. Salir del sistema");
        System.out.println("Ingrese la opcion deseada");
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                gestionarIngreso(scanner);
                break;
            case 2:
                mostrarCapacidadDisponible();
                break;
            case 3:
                mostrarDineroRecaudado();
                break;
            case 0:
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                break;
        }
    }

    private void gestionarIngreso(Scanner scanner) {
        System.out.println("--- Ingrese sus datos ---");

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su DNI: ");
        int dni = scanner.nextInt();

        System.out.print("Ingrese su tipo de pase (normal/vip/descuento): ");
        String tipoPase = scanner.next();

        if (edad >= 21) {
            double precioEntrada;

            if (tipoPase.equalsIgnoreCase("vip")) {
                precioEntrada = 0;
            } else if (tipoPase.equalsIgnoreCase("descuento")) {
                precioEntrada = 0.5 * 1500;
            } else {
                precioEntrada = 1500;
            }

            System.out.print("¿Desea comprar entrada normal o VIP? (normal/vip): ");
            String tipoEntrada = scanner.next();

            if (tipoEntrada.equalsIgnoreCase("normal")) {
                capacidadDisponible--;
                dineroRecaudado += precioEntrada;
                System.out.println("Bienvenido/a, " + nombre + "! Disfruta tu noche en el boliche.");
            } else if (tipoEntrada.equalsIgnoreCase("vip") && tipoPase.equalsIgnoreCase("vip")) {
                capacidadDisponible--;
                dineroRecaudado += precioEntrada;
                System.out.println("Bienvenido/a, " + nombre + "! Disfruta tu noche en el boliche (VIP).");
            } else {
                System.out.println("Tipo de entrada no válido. Ingreso cancelado.");
            }
        } else {
            System.out.println("Lo siento, no cumples con los requisitos para ingresar.");
        }
    }
}
