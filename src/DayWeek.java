import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во попыток");
        int numberDay = scanner.nextInt();

        for (int i = 0; i < numberDay; i++) {
            System.out.println("Введите номер дня недели");
            int day = scanner.nextInt();
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Undefined");
            }
        }
        System.out.println("Программа закончена");
    }
}
