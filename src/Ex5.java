import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть перше число: ");
            int a = scanner.nextInt();
            System.out.print("Введіть друге число: ");
            int b = scanner.nextInt();
            int result = a * b;
            System.out.println("Результат множення: " + result);
            System.out.print("Щоб завершити, введіть 1, щоб продовжити, введіть будь-яке інше число: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                break;
            }
        }
    }
}
