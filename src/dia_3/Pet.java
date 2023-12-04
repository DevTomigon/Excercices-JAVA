package dia_3;

public class Pet {
    private String name = "Bosco";
    private PetType type = PetType.perro;
    private int age = 3;
    private String owner = "Tomas";

    public Pet(String name, PetType type, int age, String owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public enum PetType { perro, gato, pájaro, pez, otros }
}
