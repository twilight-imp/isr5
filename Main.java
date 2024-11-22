import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        String text = "Это новый текст";
        for (String word: text.split(" ")) {
            System.out.println(word);
        }
        System.out.println("Это добавлено в ветке main");

        System.out.println("Теперь проверим работу суммирования");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        double res = a + b;
        System.out.println("Вот их сумма: " + res);

    }
} 