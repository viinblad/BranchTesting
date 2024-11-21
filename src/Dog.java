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
    @Override
    public void showMood(boolean isHappy) {
        if (isHappy) {
            System.out.println("Dog is wagging its tail.");
        } else {
            System.out.println("Dog is growling.");
        }
    }
}
