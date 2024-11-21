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
}
