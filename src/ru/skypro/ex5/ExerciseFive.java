package ru.skypro.ex5;

public class ExerciseFive {
    public static void main(String [] args) {
        int mashaSalary = 67_760;
        int mashaSalaryYear = mashaSalary * 12;

        float mashaNewSalary = mashaSalary * 1.1f;
        float mashaNewSalaryYear = mashaNewSalary * 12;
        float mashaDifference = mashaNewSalaryYear % mashaSalaryYear;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. " + "Годовой доход вырос на " + mashaDifference + " рублей.");
        int denisSalary = 83_690;
        int denisSalaryYear = denisSalary * 12;

        float denisNewSalary = denisSalary * 1.1f ;
        float denisNewSalaryYear = denisNewSalary * 12;
        float denisDifference = denisNewSalaryYear % denisSalaryYear;

        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. " + "Годовой доход вырос на " + denisDifference + " рублей.");

        int kristinaSalary = 76_230;
        int kristinaSalaryYear = kristinaSalary * 12;

        float kristinaNewSalary = kristinaSalary * 1.1f;
        float kristinaNewSalaryYear = kristinaNewSalary * 12;
        float kristinaDifference = kristinaNewSalaryYear % kristinaSalaryYear;

        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. " + "Годовой доход вырос на " + kristinaDifference + " рублей.");

    }
}
