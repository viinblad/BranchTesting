public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    @Override
    public boolean eat(String foodType) {
        System.out.println("Dog eats " + foodType);
        return true;
    }
}
