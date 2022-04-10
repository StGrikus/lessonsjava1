package WildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(0));
        listOfAnimal.add(new Animal(1));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);

        /*
        Иерархия наследования
            Object
             Animal
              Dog
                При extends мы хотели видеть Animal и все потомки, в данном случае Dog
                Когда мы делаем super мы хотим видеть всех родителей класса Animal
         */
    }

    private static void test(List<? extends Animal> list) {
        for(Animal animal : list) {
            animal.eat();
        }
    }
}
