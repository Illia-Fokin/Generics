public class Main {
    public static void main(String[] args) {
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(new Cat());
        HomeAnimal<Dog> homeDog = new HomeAnimal<>(new Dog());
//        HomeAnimal<Shark> homeShark = new HomeAnimal<>(new Shark()); It is impossible to create an object
        // because the class Shark doesn't meet the requirements of HomeAnimal class.

        homeDog.showAnimalClassType();
        homeDog.getAnimal().run();
        homeDog.getAnimal().speak();
        homeDog.sleepOnTheCouch();

        System.out.println();

        homeCat.showAnimalClassType();
        homeCat.getAnimal().run();
        homeCat.getAnimal().speak();
        homeCat.sleepOnTheCouch();
    }
}