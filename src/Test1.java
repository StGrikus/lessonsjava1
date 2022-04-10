import java.util.ArrayList;
import java.util.List;

//ведение в параметризацию generics

public class Test1 {
    public static void main(String[] args) {

        ///////////////////// До появления Generics ////////////////////////////////////
        List animals = new ArrayList();
        Animalss ourAnimal = new Animalss();
        animals.add("cat");          //0
        animals.add("dog");          //1
        animals.add("frog");         //2
        animals.add(ourAnimal);

        //String animal = animals.get(1);нужно сделать доункаст
        String animal = (String) animals.get(0);
        System.out.println(animal);

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

        String a = animals2.get(0);
        System.out.println(a);
    }
}
 class Animalss {

 }

