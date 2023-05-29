import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User tom = new User("Tom", 21, 1);
        User maks = new User("Maks", 41, 2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id Пользователя: ");
        Scanner scanner1 = new Scanner(System.in);
        int p = scanner.nextInt();
        System.out.println("Введите что хотите сделать: 1 - Поверхностное клонирование. 2 - Глубокое клонирование ");
        int s = scanner1.nextInt();
        if (p == tom.getId() && s == 1) {
            User clonedTom = tom.clone();
            System.out.println("Оригинал:\t" + tom);
            System.out.println("Клон:   \t" + clonedTom);
        } else if (p == maks.getId() && s == 1) {
            User clonedMaks = maks.clone();
            System.out.println("Оригинал:\t" + maks);
            System.out.println("Клон:   \t" + clonedMaks);
        } else if (p == tom.getId() && s == 2) {
            try {
                User dClonedTom = tom.deepCopy();
                System.out.println("Оригинал:\t" + tom);
                System.out.println("Клон:   \t" + dClonedTom);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (p == maks.getId() && s == 2) {
            try {
                User dClonedMaks = maks.deepCopy();
                System.out.println("Оригинал:\t" + maks);
                System.out.println("Клон:   \t" + dClonedMaks);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
