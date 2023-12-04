package dia_2;

public class persona {
    public String firstName = "Tomas";
    public String lastName = "Gonzalez";

    public int identityCard = 45409497;

    public int age = 19;

    public double height = 1.65;

    public boolean married = false;

    public String[] petsNames = {"Perro","Gato"};

    public persona(String firstName, String lastName, int identityCard, int age, double height, boolean married, String[] petsNames){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }

    // Getter para firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter para lastName
    public String getLastName() {
        return lastName;
    }

    // Getter para identityCard
    public int getIdentityCard() {
        return identityCard;
    }

    // Getter para age
    public int getAge() {
        return age;
    }

    // Getter para height
    public double getHeight() {
        return height;
    }

    // Getter para married
    public boolean isMarried() {
        return married;
    }

    // Getter para petsNames
    public String[] getPetsNames() {
        return petsNames;
    }

    public void presentarse(){
        System.out.println("Hola mi nombre es " + this.firstName + " " + this.lastName);
        System.out.println("Mi DNI es " + this.identityCard);
        System.out.println("Tengo " + this.age +" años" + " de edad y mido " + this.height + " metros de altura.");


        if (this.married) {
            System.out.println("Estado civil: Casado/a");
        } else {
            System.out.println("Estado civil: Soltero/a");
        }

        System.out.print("Mis mascotas se llaman: ");
        for (String petName : this.petsNames) {
            System.out.print(petName + " ");
        }
        System.out.println();
        System.out.println("------------- . -------------");
    }
}

