package ru.skypro.ex6;

public class ExerciseSix {
    public static void main(String[] args) {
    byte a = 12;
    byte b = 27;
    byte c = 44;
    byte d = 15;
    byte e = 9;
    int result = a * (b + (c-d*e));
    result = -result;
        System.out.println("Результат вычислений " + result);

    }
}
