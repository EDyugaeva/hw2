package ru.skypro.ex4;

public class ExerciseFour {
    public static void main(String[] args) {
     byte goal = 7;
     short variant1 = 250;
     short variant2 = 500;
     int day1 = goal * 1000/ variant1;
     System.out.println(day1 + " дней понадобится боксеру при похудении на 250 гр в день");

     int day2 = goal * 1000/ variant2;
     System.out.println(day2 + " дней понадобится боксеру при похудении на 500 гр в день");

     int variantMiddle = (variant1 + variant2)/2;
     float day3 = goal * 1000f/ variantMiddle;
     System.out.println(day3 + " дней понадобится боксеру в среднем");


    }
}
