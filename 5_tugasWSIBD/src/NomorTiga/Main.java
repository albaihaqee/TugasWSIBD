package NomorTiga;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.makeNoise();  // Output: talk

        Dog dog = new Dog();
        dog.makeNoise();  // Output: Bark

        Animal animaldog = new Dog();
        animaldog.makeNoise();  // Output: Bark (karena overriding)

        // Menggunakan instanceof untuk memeriksa tipe objek
        if (animal instanceof Animal)
            System.out.println("animal is Animal");

        if (dog instanceof Animal)
            System.out.println("dog is Animal");

        if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal");

        if (animaldog instanceof Dog)
            System.out.println("animaldog is Dog");
    }
}
