import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // public - на всем проекте, private - только в приделах одного класса(можно днлать приватные методы),
        // default - модификатор доступа по умолчанию. Доступно в пределах пакета, protected - доступны в пределах
        // одного пакета, эти поля и методы доступны всем подклассам, даже если подклассы вне пакета где они были
        // декларированы
        // класс может быть публичным или деволтным. Класс который совпвдает с названием файла должен быть публичным(!)
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        test(a1);
        test(d1);
        test(c1);
        System.out.println(" ");

        //lesson30

        float f = (float) 123.2; // float f = 123.4f
        int a = 1234;
        long l = a; //не явное(делается за нас)
        int x = (int) l;  //явное
        //все что int может быть long, но не ноборот. long  2 раза больше чем int
        //чтобы конвертировать лонг в инт нужно перед лонг указать тип переменной -> int x = (int)l, где l = long
        System.out.println(x);

        double d = 123.9;
        int y = (int) d;
        System.out.println(y);

        long i = Math.round(d);
        System.out.println(i);

        byte q = (byte) 129; // -128 -> 127
        System.out.println(q);

        //Double Float, LOng, Integer, Short, Byte, Character, Boolean - классы обертки

        int w = 1;
        Integer w1 = 123;
        int e = w1;

        Integer.parseInt("123");

        ///////////////////////// Generics lesson33 ///////////////////////////////////////////////
        //////////////////////// До появления Generics ////////////////////////////////////////////
        List list = new ArrayList();
        Animaal ourAnimal = new Animaal();
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add(ourAnimal);
        //String animal = animals.get(1);нужно сделать доункаст
        String ss = (String) list.get(0);
        System.out.println(ss);
        //////////////////// После появления Generics //////////////////////////////////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("frog");
        //animals1.add(ourAnimal); нельзя поместить никакой объект кроме стинг
        String animal1 = animals1.get(2);
        System.out.println(animal1);
        /////////////////// С появлением Java 7 ///////////////////////////////////////
        List<String> animals2 = new ArrayList<>();
        animals2.add("dog");
        String sss = animals2.get(0);
        System.out.println(sss);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}

class Animaal {

}
