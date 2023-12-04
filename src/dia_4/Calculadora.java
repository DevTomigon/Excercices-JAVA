package dia_4;

import java.util.Scanner;

public class Calculadora implements CalculadoraOperaciones {
    @Override
    public void realizarSuma(Scanner scanner) {
        System.out.println("Ingrese dos números para sumar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    @Override
    public void realizarResta(Scanner scanner) {
        System.out.println("Ingrese dos números para restar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    @Override
    public void realizarMultiplicacion(Scanner scanner) {
        System.out.println("Ingrese dos números para multiplicar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    @Override
    public void realizarDivision(Scanner scanner) {
        System.out.println("Ingrese dos números para dividir:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);
    }
}