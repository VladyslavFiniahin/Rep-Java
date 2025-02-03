//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1.
        System.out.println("Task 1");
        int num1 = 52;
        int num2 = 5;

        int task1 = num1 / num2;
        int task2 = num1 % num2;

        System.out.println("Результат ділення від " +num1 +" = " +task1);
        System.out.println("Залишок ділення від " +num1 +" = " +task2);

        // Task 2.
        System.out.println("Task 2");
        int num1_1 = 69;
        int task1_1 = num1_1 / 10;
        int task2_1 = num1_1 % 10;

        int sum = task1_1 + task2_1;

        System.out.println("Сума від " +num1_1 + " = " + sum);

        //Task 3.
        System.out.println("Task 3");
        double num1_2 = 19.6;
        int result = (int) (num1_2 + 0.5);

        System.out.println("Округлене число = " +result);
    }
}