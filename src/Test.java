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

        float f = (float)123.2; // float f = 123.4f
        int a = 1234;
        long l = a; //не явное(делается за нас)
        int x = (int)l;  //явное
        //все что int может быть long, но не ноборот. long  2 раза больше чем int
        //чтобы конвертировать лонг в инт нужно перед лонг указать тип переменной -> int x = (int)l, где l = long
        System.out.println(x);

        double d = 123.9;
        int y = (int)d;
        System.out.println(y);

        long i = Math.round(d);
        System.out.println(i);

        byte q = (byte)129; // -128 -> 127
        System.out.println(q);

        //Double Float, LOng, Integer, Short, Byte, Character, Boolean - классы обертки

        int w = 1;
        Integer w1 = 123;
        int e = w1;

        Integer.parseInt("123");
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
