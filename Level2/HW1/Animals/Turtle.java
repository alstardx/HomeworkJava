package Lesson0001.HW1.Animals;

public class Turtle extends Animal {
    public Turtle(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Какойто звук");
    }

    public void swim() {
        System.out.println(getName() + " плывет");
    }
}
