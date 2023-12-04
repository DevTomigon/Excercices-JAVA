package dia_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boliche boliche = new Boliche();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            boliche.mostrarMenu();  //
            opcion = scanner.nextInt();

            boliche.ejecutarOpcion(opcion);  //

        } while (opcion != 0);

        scanner.close();
    }
}
