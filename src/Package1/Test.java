package Package1;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //Upcasting - восходящее преобразование
        Animal a1 = dog;

        //Downcasting - Нисходящее преоразование
        Dog dog2 = (Dog) a1;
        dog2.bark();
    }
}
