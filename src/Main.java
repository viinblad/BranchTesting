public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Boogie");
        Animal cat = new Cat("Whiskers");

        System.out.println(dog.getName() + " says:");
        dog.makeSound();
        dog.eat("bone");
        dog.showMood(true);  // Test for happy dog
        dog.showMood(false); // Test for unhappy dog
        dog.jump(3);


        System.out.println(cat.getName() + " says:");
        cat.makeSound();
        cat.eat("fish");
        cat.showMood(true);  // Test for happy cat
        cat.showMood(false); // Test for unhappy cat
        cat.jump(2);
    }
}
