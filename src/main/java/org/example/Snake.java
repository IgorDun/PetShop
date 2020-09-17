package org.example;

public class Snake extends Animal{
    public Snake(String name, int age, double price) {
        super(name, age, price);
    }
    public void voice() {
        System.out.println("Shhhhhhhh");
    }

    public void voice(byte SnakeFood) {
        if (SnakeFood < 3) {
            voice();
        } else {
            System.out.println("..........");
        }
    }
}
