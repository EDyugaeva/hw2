package ru.skypro.ex3;

public class ExerciseThree {
    public static void main(String[] args) {
        short banana = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egs = 4 * 70;

        int weight = banana + milk +  iceCream +  egs;
        System.out.println("Вес завтрака " + weight + "гр");

        float weightKg = weight / 1000f;
        System.out.println("Вес завтрака " + weightKg + "кг");

    }
}
