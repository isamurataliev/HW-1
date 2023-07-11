import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String variable;
        final int NUM = 5;
        String word = "Hello";

        variable = NUM + " " + word;

        System.out.println("Значение переменной variable: " + variable);
        System.out.println("Значение константы NUM: " + NUM);
        System.out.println("Значение переменной word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}