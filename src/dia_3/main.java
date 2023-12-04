package dia_3;

public class main {
    public static void main(String[] args){
    // Crear mascotas como objetos Pet
    Pet bosco = new Pet("Bosco", Pet.PetType.perro, 3, "Tomas");
    Pet homero = new Pet("Homero", Pet.PetType.perro, 2, "Tomas");

    // Crear persona con mascotas
    Person yo = new Person("Tomas", "Gonzalez", 45409497, 19, 1.65, false);
        yo.addPet(bosco);
        yo.addPet(homero);

    // Amigo imaginario
    Pet mirko = new Pet("Mirko", Pet.PetType.perro, 5, "Amigo Imaginario");
    Pet thor = new Pet("Thor", Pet.PetType.gato, 3, "Amigo Imaginario");
    Person amigoImaginario = new Person("Amigo", "Imaginario", 87654321, 30, 1.80, true);
        amigoImaginario.addPet(mirko);
        amigoImaginario.addPet(thor);

        System.out.println("Detalles sobre ti:");
        yo.presentarse();

        System.out.println("Detalles sobre tu amigo imaginario:");
        amigoImaginario.presentarse();
    }
}
