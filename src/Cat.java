public class Cat extends Animal implements Run, Speak{
    @Override
    public void run() {
        System.out.println("The cat runs");
    }

    @Override
    public void speak() {
        System.out.println("The cat meows");
    }
}
