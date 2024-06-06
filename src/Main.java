import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String iphone;
        final int NUM = 11;
        String word = "Айфон";
        iphone = NUM + word;
        System.out.println("Мой любимый," + NUM + word);
        if (NUM <0) System.out.println("Вы сохранили отрицательное число");
        else if (NUM >0) System.out.println("Вы сохранили положительное число");
        else System.out.println("Вы сохранили ноль");
        System.out.println("Введите ваше имя:");
        Scanner scanner =new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет," + userName + "!");

    }
}