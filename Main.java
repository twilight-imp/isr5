import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        System.out.println("Теперь проверим работу суммирования");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        double res = a + b;
        System.out.println("Вот их сумма: " + res);

        System.out.println("Теперь проверим работу вычитания");
        System.out.println("Введите первое число");
        double c = scanner.nextDouble();
        System.out.println("Введите второе число");
        double d = scanner.nextDouble();
        double res2 = a - b;
        System.out.println("Вот их разность: " + res2);

    }
} 