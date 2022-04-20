package lesson43;

public class Car {
    private int id;

    // вложеный нестатичный класс
    private class Motor {
        public void StartMotor(){
            System.out.println("Motor "+ id + " is starting...");
        }
    }

    //статически вложеный класс
    public static class Battery {
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Car(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.StartMotor();

        final int x = 1;

        //вложеный класс внутри метода
        class SomeClass {
            public void SomeMethod(){
                System.out.println(x+"|"+id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Car "+ id + " is starting...");
    }

    private void test(Object object){

    }
}
