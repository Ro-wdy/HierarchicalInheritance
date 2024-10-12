
public class Animall {
    // Method to display movement of an animal
    public void move() {
        System.out.println("The animal is moving.");
    }
}

class Bird extends Animall {
    // Override the move method to specify bird movement
    @Override
    public void move() {
        System.out.println("The bird is flying.");
    }
}

 class Fish extends Animall {
    // Override the move method to specify fish movement
    @Override
    public void move() {
        System.out.println("The fish is swimming.");
    }

    public static void main(String[] args) {
        // Creating an object of the Animal class
        Animall genericAnimal = new Animall();
        System.out.println("Generic Animal Movement:");
        genericAnimal.move();  // Calls Animal's move method

        System.out.println();

        // Creating an object of the Bird class
        Bird bird = new Bird();
        System.out.println("Bird Movement:");
        bird.move();  // Calls Bird's overridden move method

        System.out.println();

        // Creating an object of the Fish class
        Fish fish = new Fish();
        System.out.println("Fish Movement:");
        fish.move();  // Calls Fish's overridden move method
    }
}
