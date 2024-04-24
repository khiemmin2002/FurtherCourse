package W8.Ex2;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Dog dogAsDog = treatMeAsDog(dog);
        if (dogAsDog != null) {
            dogAsDog.makeSound();
        } else {
            System.out.println("Failed to treat as Dog");
        }

        Dog catAsDog = treatMeAsDog(cat);
        if (catAsDog != null) {
            catAsDog.makeSound();
        } else {
            System.out.println("Failed to treat as Dog");
        }

    }

    public static Dog treatMeAsDog(Animal animal) {
        try {
            return (Dog) animal;
        } catch (ClassCastException e) {
            System.out.println("IMPOSSIBLE");
            return null;
        }
    }
}
