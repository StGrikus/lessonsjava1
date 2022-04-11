package leson35;

interface AbleToEat {
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AbleToEat a = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("animal is eating...");
            }
        };
        a.eat();
    }
}
