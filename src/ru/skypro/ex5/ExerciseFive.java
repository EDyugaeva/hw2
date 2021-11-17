package ru.skypro.ex5;

public class ExerciseFive {
    public static void main(String [] args) {
        int mashaSalary = 67_760;
        int mashaSalaryYear = mashaSalary * 12;

        float mashaNewSalary = mashaSalary * 1.1f;
        float mashaNewSalaryYear = mashaNewSalary * 12;
        float mashaDifference = mashaNewSalaryYear % mashaSalaryYear;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. " + "Годовой доход вырос на " + mashaDifference + " рублей.");
        int DenisSalary = 83_690;
        int DenisSalaryYear = DenisSalary * 12;

        float DenisNewSalary = DenisSalary * 1.1f;
        float DenisNewSalaryYear = DenisNewSalary * 12;
        float DenisDifference = DenisNewSalaryYear % DenisSalaryYear;

        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. " + "Годовой доход вырос на " + DenisDifference + " рублей.");

        int KristinaSalary = 76_230;
        int KristinaSalaryYear = KristinaSalary * 12;

        float KristinaNewSalary = KristinaSalary * 1.1f;
        float KristinaNewSalaryYear = KristinaNewSalary * 12;
        float KristinaDifference = KristinaNewSalaryYear % KristinaSalaryYear;

        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей. " + "Годовой доход вырос на " + KristinaDifference + " рублей.");

    }
}
