import java.util.Scanner;

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

public class Main {
    static boolean[][] seats = new boolean[8][11];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n Бронювання місця в кінотеатрі");
                System.out.print("Введіть номер ряду (0–7): ");
                int row = Integer.parseInt(scanner.nextLine());

                System.out.print("Введіть номер місця (0–10): ");
                int seat = Integer.parseInt(scanner.nextLine());

                bookSeat(row, seat);
                System.out.println("Місце [" + row + "][" + seat + "] заброньовано");

            } catch (SeatUnavailableException e) {
                System.out.println("Помилка: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Місце не знайдено");
            } catch (NumberFormatException e) {
                System.out.println("Введіть число");
            }

            System.out.print("\n Продовжити бронювання? (так/ні): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("так")) {
                break;
            }
        }

        scanner.close();
    }

    public static void bookSeat(int row, int seat) throws SeatUnavailableException {
        if (seats[row][seat]) {
            throw new SeatUnavailableException("Місце зайняте");
        } else {
            seats[row][seat] = true;
        }
    }
}