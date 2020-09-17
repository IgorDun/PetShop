package org.example;

public class PetShop {
    private Animal dog = new Dog("Axe", 5, 500);
 //   private Animal cat = new Cat("Asya", 4, 300);
    private Animal cat = new Cat("Asya", 4, 300);
 //   private Animal snake = new Snake();


    public PetShop() {
        System.out.println("Welcom to our 'PetShop'");
        System.out.println("We have one cat and one dog");
    }




    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
//            case SNAKE:
//                return snake;
            default:
                throw new RuntimeException("wrong type animal");
        }

    }
    public PetShop sell(Man man, Animal pet) {
        if (pet.price > man.getMoney()) {
            System.out.println("Не хватает денег");
        } else {
            System.out.println("Успешная покупка: " + pet);
            System.out.println("Осталось денег: " + (man.getMoney()-pet.price));
        }
}
