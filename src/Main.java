public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int monthlySavings = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + monthlySavings;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(" " + number + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationCountryY = 12_000_000;
        int fertilityPer1000people = 17;
        int mortalityPer1000people = 8;
        for (int period = 1; period <= 10; period++) {
            populationCountryY = populationCountryY + (populationCountryY / 1000 * (fertilityPer1000people - mortalityPer1000people));
            System.out.println("Год " + period + " численность населения составляет " + populationCountryY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double contribution = 15_000;
        double sum = 0;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + contribution + contribution * 0.07;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double contribution = 15_000;
        double sum = 0;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + contribution + contribution * 0.07;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double contribution = 15_000;
        double sum = 0;
        int year = 9;
        int month = 0;
        while (month < (year * 12)) {
            sum = sum + contribution + contribution * 0.07;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 3; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 1823;
        for (int i = 0; i <= 2123; i = i + 79) {
            if (i >= startYear) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}