package dia_2;

public class Dia2 {
    public static void main(String[] args) {

        String[] tusMascotas = {"Bosco","y", "Homero"};
        persona yo = new persona("Tomas", "Gonzalez", 45409497, 19, 1.65, false, tusMascotas);

        // amigo imaginario
        String[] mascotasAmigo = {"Mirko","y","Thor"};
        persona amigoImaginario = new persona("Amigo", "Imaginario", 87654321, 30, 1.80, true, mascotasAmigo);


        System.out.println("Detalles sobre ti:");
        yo.presentarse();

        System.out.println("Detalles sobre tu amigo imaginario:");
        amigoImaginario.presentarse();
    }
}