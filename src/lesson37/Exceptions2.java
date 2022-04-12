package lesson37;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerExceptions {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x !=0) {
                throw new ScannerExceptions("пользователь ввел что-то кроме нуля");
            }
        }
    }
}
