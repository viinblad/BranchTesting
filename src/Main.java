public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Boogie");
        Animal cat = new Cat("Whiskers");

        System.out.println(dog.getName() + " says:");
        dog.makeSound();
        dog.eat("bone");

        System.out.println(cat.getName() + " says:");
        cat.makeSound();
        cat.eat("fish");
    }
}
