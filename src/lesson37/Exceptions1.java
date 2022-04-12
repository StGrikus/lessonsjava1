package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("Test2");

        try {
            Scanner scaner = new Scanner(file);
            System.out.println("после scanner");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        System.out.println("После блока try-catch");
    }

    public static void readFile () throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
