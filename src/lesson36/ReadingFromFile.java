package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        String separator = File.separator;
        String path = separator + "C" + separator + "Users" + separator + "kpstu" + separator + "Desktop" + separator + "Test.txt";
        */
        File file = new File("C:\\Users\\kpstu\\Desktop\\Test.txt");
        File file1 = new File("C:\\Users\\kpstu\\Desktop\\Test1.txt");
        File file2 = new File("Test2");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        Scanner scanner2 = new Scanner(file2);
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }

        scanner.close();
    }
}
