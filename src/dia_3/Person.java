package dia_3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName = "Tomas";
    private String lastName = "Gonzalez";
    private int identityCard = 45409497;
    private int age = 19;
    private double height = 1.65;
    private boolean married = false;
    private List<Pet> pets = new ArrayList<>();

    public Person(String firstName, String lastName, int identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void presentarse() {
        System.out.println("Hola! mi nombre es " + this.firstName + " " + this.lastName);
        System.out.println("Mi DNI es " + this.identityCard);
        System.out.println("Tengo " + this.age + " años" + " de edad y mido " + this.height + " metros de altura.");

        if (this.married) {
            System.out.println("Estado civil: Casado/a");
        } else {
            System.out.println("Estado civil: Soltero/a");
        }

        System.out.print("Mis mascotas son: ");
        for (Pet pet : this.pets) {
            System.out.print(pet.getName() + " es un" + " " + pet.getType() + " y tiene" + " "+ pet.getAge() + " años, ");
        }
        System.out.println();
        System.out.println("------------- . -------------");
    }
}