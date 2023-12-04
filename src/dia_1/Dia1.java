package dia_1;

import java.util.Objects;
import java.util.Scanner;

public class Dia1 {
    int capacidadDisponible = 500;
    double dineroRecaudado = 0;

    public static void main(String[] args) {
//        // Ejercicio 1
//        String name = "Tomas";
//        String lastname = "Gonzalez";
//        int age = 19;
//
//        System.out.println("Hola mi nombre es " + name + " " + lastname + ", tengo " + age + " años");
//
//        // Ejercicio 2
//        Dia1 objetoDia1 = new Dia1();
//        objetoDia1.saludar();
//
//        // Ejercicio 3
//        Dia1 objetodia1 = new Dia1();
//        objetodia1.mostrarNumeroMayor();
//
//        // Ejercicio 4
//        Dia1 objetoDiia1 = new Dia1();
//        objetoDiia1.mostrarNumero();
//
//        // Ejercicio 5
//        Dia1 mostrarOraciones = new Dia1();
//        mostrarOraciones.mostrarCadenaDeCaracteres();
//
//        // Ejercicio 6
//        Dia1 numeroPrimo = new Dia1();
//        numeroPrimo.mostrarNumeroPrimo();
//
//        // Ejercicio 7
//        Dia1 arrayNumeros = new Dia1();
//        int sumaImpares = arrayNumeros.MostrarArrayDeNumerosDesdePosicion(1);
//        System.out.println("Suma de impares: " + sumaImpares);
//
//        // Ejercicio 8
//        Dia1 calculadora = new Dia1();
//        calculadora.mostrarMenuCalculadora();

        Dia1 boliche = new Dia1();
        boliche.ejecutarBoliche();
    }

//    // Ejercicio 2
//    public void saludar() {
//        System.out.println("Bienvenido!");
//    }
//
//    // Ejercicio 3
//    public void mostrarNumeroMayor() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese el primer número: ");
//        int primerNumero = scanner.nextInt();
//
//        System.out.print("Ingrese el segundo número: ");
//        int segundoNumero = scanner.nextInt();
//
//        System.out.print("Ingrese el tercer número: ");
//        int tercerNumero = scanner.nextInt();
//
//        if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
//            System.out.println("El número mayor es: " + primerNumero);
//        } else if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
//            System.out.println("El número mayor es: " + segundoNumero);
//        } else {
//            System.out.println("El número mayor es: " + tercerNumero);
//        }
//    }
//
//    // Ejercicio 4
//    public void mostrarNumero() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese un número:");
//        int numeroIngresado = scanner.nextInt();
//
//        if (numeroIngresado % 2 == 0) {
//            System.out.println("Su número es par");
//        } else {
//            System.out.println("Su número es impar");
//        }
//    }
//
//    // Ejercicio 5
//    public void mostrarCadenaDeCaracteres() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese una oración");
//        String oracionIngresada = scanner.nextLine();
//
//        System.out.println("Ingrese otra oración");
//        String segundaOracionIngresada = scanner.nextLine();
//
//        if (Objects.equals(oracionIngresada, segundaOracionIngresada)) {
//            System.out.println("Sus oraciones son iguales");
//        } else {
//            System.out.println("Sus oraciones son diferentes");
//        }
//    }
//
//    // Ejercicio 6
//    public void mostrarNumeroPrimo() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un número:");
//        int numeroIngresado = scanner.nextInt();
//
//        boolean esPrimo = true;
//
//        if (numeroIngresado <= 1) {
//            esPrimo = false;
//        } else {
//            for (int i = 2; i <= numeroIngresado / 2; i++) {
//                if (numeroIngresado % i == 0) {
//                    esPrimo = false;
//                    break;
//                }
//            }
//        }
//
//        if (esPrimo) {
//            System.out.println("Su número es primo");
//        } else {
//            System.out.println("Su número no es primo");
//        }
//    }
//
//    // Ejercicio 7
//    public int MostrarArrayDeNumerosDesdePosicion(int posicionInicial) {
//        int arrayNumeros[] = new int[10];
//        int sumaImpares = 0;
//
//        for (int i = 0; i < arrayNumeros.length; i++) {
//            arrayNumeros[i] = i + 1;
//        }
//
//        for (int i = posicionInicial - 1; i < arrayNumeros.length; i++) {
//            System.out.println(arrayNumeros[i]);
//
//            if (arrayNumeros[i] % 2 != 0) {
//                sumaImpares += arrayNumeros[i];
//            }
//        }
//        System.out.println();
//
//        return sumaImpares;
//    }
//
//    // Ejercicio 8
//    public void mostrarMenuCalculadora() {
//        Scanner scanner = new Scanner(System.in);
//
//        int opcion;
//
//        do {
//            System.out.println("---- Menú de Calculadora ----");
//            System.out.println("1. Sumar");
//            System.out.println("2. Restar");
//            System.out.println("3. Multiplicar");
//            System.out.println("4. Dividir");
//            System.out.println("0. Salir");
//
//            System.out.print("Ingrese la opción deseada: ");
//            opcion = scanner.nextInt();
//
//            // Realizar la operación correspondiente según la opción seleccionada
//            switch (opcion) {
//                case 1:
//                    realizarSuma();
//                    break;
//                case 2:
//                    realizarResta();
//                    break;
//                case 3:
//                    realizarMultiplicacion();
//                    break;
//                case 4:
//                    realizarDivision();
//                    break;
//                case 0:
//                    System.out.println("Saliendo del programa. ¡Hasta luego!");
//                    break;
//                default:
//                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
//                    break;
//            }
//
//        } while (opcion != 0);
//
//        scanner.close();
//    }
//
//    // Métodos para realizar operaciones
//    public void realizarSuma() {
//        System.out.println("Ingrese dos números para sumar:");
//        Scanner scanner = new Scanner(System.in);
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//        double resultado = num1 + num2;
//        System.out.println("Resultado: " + resultado);
//    }
//
//    public void realizarResta() {
//        System.out.println("Ingrese dos números para restar:");
//        Scanner scanner = new Scanner(System.in);
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//        double resultado = num1 - num2;
//        System.out.println("Resultado: " + resultado);
//    }
//
//    public void realizarMultiplicacion() {
//        System.out.println("Ingrese dos números para multiplicar:");
//        Scanner scanner = new Scanner(System.in);
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//        double resultado = num1 * num2;
//        System.out.println("Resultado: " + resultado);
//    }
//
//    public void realizarDivision() {
//        System.out.println("Ingrese dos números para dividir:");
//        Scanner scanner = new Scanner(System.in);
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//
//        if (num2 != 0) {
//            double resultado = num1 / num2;
//            System.out.println("Resultado: " + resultado);
//        } else {
//            System.out.println("No se puede dividir por cero. Por favor, ingrese un divisor diferente.");
//        }
//    }


    public void ejecutarBoliche() {
        Scanner scanner = new Scanner(System.in);



        int opcion2;

        do {
            System.out.println("--- Menú del Boliche ---");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("0. Salir del sistema");

            System.out.println("Ingrese la opcion deseada");
            opcion2 = scanner.nextInt();


            switch (opcion2) {
                case 1:
                    ingresoDeDatos(scanner);
                    break;
                case 2:
                    mostrarCapacidadDisponible(capacidadDisponible);
                    break;
                case 3:
                    mostrarDineroRecaudado(dineroRecaudado);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                    break;
            }

        } while (opcion2 != 0);

        scanner.close();
    }
    public void ingresoDeDatos(Scanner scanner) {

        System.out.println("--- Ingrese sus datos ---");

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.next();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su DNI: ");
        int dni = scanner.nextInt();
        System.out.println("Ingrese su tipo de pase (normal/vip/descuento): ");
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

            System.out.println("¿Desea comprar entrada normal o VIP? (normal/vip): ");
            String tipoEntrada = scanner.next();

            if (tipoEntrada.equalsIgnoreCase("normal")) {
                capacidadDisponible--;
                dineroRecaudado += precioEntrada;
                System.out.println("Bienvenido/a, " + nombre + "! Disfruta tu noche en el boliche.");
            } else if (tipoEntrada.equalsIgnoreCase("vip") && tipoPase.equalsIgnoreCase("vip")) {
                capacidadDisponible--;
                System.out.println("Bienvenido/a, " + nombre + "! Disfruta tu noche en el boliche (VIP).");
            } else {
                System.out.println("Tipo de entrada no válido. Ingreso cancelado.");
            }
        } else {
            System.out.println("Lo siento, no cumples con los requisitos para ingresar.");
        }
    }

    public void mostrarCapacidadDisponible(int capacidadDisponible) {
        System.out.println("Capacidad disponible: " + capacidadDisponible + " personas");
    }

    public void mostrarDineroRecaudado(double dineroRecaudado) {
        System.out.println("Dinero recaudado: $" + dineroRecaudado);
    }
}
