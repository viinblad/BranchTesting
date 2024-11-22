public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    @Override
    public boolean eat(String foodType) {
        System.out.println("Cat eats " + foodType);
        return true;
    }
    @Override
    public void showMood(boolean isHappy) {
        if (isHappy) {
            System.out.println("Cat is purring.");
        } else {
            System.out.println("Cat is hissing.");
        }
    }
    @Override
    public void jump(double distance) {
        System.out.println("Cat jumps " + distance + " meters!");
    }

}
