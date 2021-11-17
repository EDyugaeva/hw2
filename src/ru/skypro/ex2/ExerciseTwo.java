package ru.skypro.ex2;

public class ExerciseTwo {
    public static void main(String[] args) {
        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float summweight = weightFirstBoxer + weightSecondBoxer;
        float differenceweight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Общий вес двух бойцов " + summweight + " кг!");
        System.out.println("Разница в весе бойцов " + differenceweight + " кг!");

    }

}
