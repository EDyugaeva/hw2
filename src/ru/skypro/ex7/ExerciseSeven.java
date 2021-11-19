package ru.skypro.ex7;

public class ExerciseSeven {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 7;
        System.out.println("Было: a = " + a + " b = " + b);
        a = (byte) (b - a);
        b = (byte) (b - a);
        a = (byte) (a + b);
        System.out.println("Стало: a = " + a + " b = " + b);

    }
}
