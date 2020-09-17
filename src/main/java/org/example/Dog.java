package org.example;

import lombok.ToString;

public class Dog extends Animal {
    public Dog(String name, int age, double price) {
      super(name, age, price);
    }

    public void voice() {
        System.out.println("Woowh");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public void voice(byte dogFood){
        if (dogFood < 5) {
            voice();
        }else{
            System.out.println("......");
        }

    }
}