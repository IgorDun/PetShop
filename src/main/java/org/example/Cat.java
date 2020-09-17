package org.example;

import lombok.ToString;

public class Cat extends Animal {

    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Myaow");
    }
    public void voice(byte catFood){
        if (catFood < 2) {
            voice();
        }else{
            System.out.println("......");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
