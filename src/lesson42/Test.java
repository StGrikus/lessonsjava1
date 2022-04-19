package lesson42;

public class Test {
    public static void main(String[] args) {
        // == для примитивный типов данных
        //  animal1    ->         {1}
        //  animal2    ->         {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        System.out.println();

        String string = "Hello"; //   string -> {"Hello"}
        String string1 = "Hello";//   string1 -> ссылает на string -> {"Hello"}

        String s = new String("Hello"); //в таком случае s1 не ссылается на s -> {"Hello"}
        String s1 = new String("Hello");

        System.out.println(string == string1);
        System.out.println(string.equals(string1));

        System.out.println();

        System.out.println(s == s1);
        System.out.println(s.equals(s1));
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}