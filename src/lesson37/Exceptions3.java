package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exception(Compile time exception) во время компиляции = исключительные случаи в ходе программы
        File file = new File("Test2");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        //Unchecked Exception (Runtime exception) во время выполнения = ошибка во время работы программы

        int a = 1/0;
        System.out.println(a);

        String name = null;
        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
