package org.example;

public class PetShopSell {
    public PetShopSell(Man man, Animal pet) {
        if (pet.price > man.getMoney()) {
            System.out.println("Не хватает денег");
        } else {
            System.out.println("Успешная покупка: " + pet);
            System.out.println("Осталось денег: " + (man.getMoney()-pet.price));
        }
    }
}
