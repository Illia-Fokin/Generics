class HomeAnimal<T extends Animal & Run & Speak> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showAnimalClassType() {
        System.out.println("Animal type is: " + animal.getClass().getName());
    }

    public void sleepOnTheCouch() {
        System.out.println("The animal is sleeping on the couch.");
    }
}

