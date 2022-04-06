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
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
