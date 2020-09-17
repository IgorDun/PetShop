package org.example;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        Man man = new Man("John Connor", 42, 1300);
        Animal pet = shop.getAnimal(AnimalType.CAT);
        PetShopSell sell = new PetShopSell(man, pet);

    }
}
