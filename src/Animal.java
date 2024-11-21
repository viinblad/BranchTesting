public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract metode, der implementeres i subclasses
    public abstract void makeSound();

    public abstract boolean eat(String foodType);
}
