import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //завдання 1
        System.out.print("Введіть число для перевірки діапазону: ");
        int n = scanner.nextInt();
        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");
        }

        //завдання 2
        System.out.print("Введіть тризначне число: ");
        int num = scanner.nextInt();
        int maxDigit = Math.max(num / 100, Math.max((num / 10) % 10, num % 10));
        System.out.println("Найбільша цифра: " + maxDigit);

        //завдання 3
        System.out.print("Введіть поточний поверх: ");
        int currentFloor = scanner.nextInt();
        System.out.print("Введіть бажаний поверх: ");
        int targetFloor = scanner.nextInt();
        if (targetFloor == 2) {
            targetFloor = (currentFloor < 2) ? 3 : 1;
        }
        System.out.println("Ви " + (targetFloor > currentFloor ? "піднялись" : "спустились") + " на " + targetFloor + " поверх");

        //завдання 4
        System.out.print("Введіть команду (Так, ОК, Yes, Y, +, Ok, Ні, NO, N, -, No): ");
        String command = scanner.next();
        switch (command) {
            case "Так", "ОК", "Yes", "Y", "+", "Ok" -> System.out.println("Я погоджуюсь!");
            case "Ні", "NO", "N", "-", "No" -> System.out.println("Я відмовляюсь!");
            default -> System.out.println("Невідома команда!");
        }

        //завдання 5
        System.out.print("Введіть три різні числа: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a > b) { int temp = a; a = b; b = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        if (a > b) { int temp = a; a = b; b = temp; }
        System.out.println("Числа у порядку зростання: " + a + " " + b + " " + c);
    }
}