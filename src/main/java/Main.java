
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int carNumber = 1; carNumber <= 3; carNumber++) {
            int speed = 0;
            System.out.println("Введите название машины №" + carNumber);
            String name = scanner.next();
            while (name.isEmpty()) {
                System.out.println("Неверное название! Попробуйте снова.");
                System.out.println("Введите название машины №" + carNumber);
                name = scanner.next();
            }

            System.out.println("Введите скорость машины №" + carNumber);
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
            }
            while (speed <= 0 || speed > 250) {
                System.out.println("Неверная скорость! Попробуйте снова.");
                System.out.println("Введите скорость машины №" + carNumber);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                }
                else {
                    scanner.next();
                }
            }
            race.checkLeader(new Car(name, speed)); // Проверяем новую машину на лидерство
            System.out.println();
        }
        System.out.println("Самая быстрая машина: " + race.name);

    }
}