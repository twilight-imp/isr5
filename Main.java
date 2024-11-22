class Main{
    public static void main(String[] args) {
        String text = "Это новый текст";
        for (String word: text.split(" ")) {
            System.out.println(word);
        }
        System.out.print("Это добавлено в ветке main");
    }
} 