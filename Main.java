import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        String text = "Это новый текст для задания 2";
        for (String word: text.split(" ")) {
            System.out.println(word);
        }
        System.out.print("Это добавлено в ветке dev");


        System.out.println("Теперь опять проверим работу суммирования");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int res = a + b;
        System.out.println("Вот их сумма: " + res);

        System.out.println("Теперь опять проверим работу вычитания");
        System.out.println("Введите первое число");
        int c = scanner.nextInt();
        System.out.println("Введите второе число");
        int d = scanner.nextInt();
        int res2 = c + d;
        System.out.println("Вот их разность: " + res2);

    }
} 