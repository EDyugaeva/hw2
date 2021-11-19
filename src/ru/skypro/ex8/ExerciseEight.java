package ru.skypro.ex8;

public class ExerciseEight {
    public static void main(String[] args) {
        short a = 789;
        int b = a % 100;
        b = b / 10;
        System.out.println("а = " + a + " Получили цифру в середине " + b);
    }
}
