public class Dog extends Animal implements Run, Speak{
    @Override
    public void run() {
        System.out.println("The dog runs");
    }

    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}
