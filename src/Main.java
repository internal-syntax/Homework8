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
        int period = 0;
        int populationProfit = ((populationCountryY / 1000) / 1000) * fertilityPer1000people;
        int populationDecline = ((populationCountryY / 1000) / 1000) * mortalityPer1000people;
        while (period < 10) {
            populationCountryY = (populationCountryY + populationProfit) - populationDecline;
            period = period + 1;
            System.out.println("Год " + period + " численность населения составляет " + populationCountryY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000;
        int interestOnDeposit = (int) (contribution * 0.07);
        int month = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + interestOnDeposit;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + contribution + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000;
        int interestOnDeposit = (int) (contribution * 0.07);
        int month = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + interestOnDeposit;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + contribution + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000;
        int interestOnDeposit = (int) (contribution * 0.07);
        int year = 9;
        int month = 0;
        while (month < (year * 12)) {
            contribution = contribution + interestOnDeposit;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + contribution + " рублей");
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
        int endYear = 2123;
        for (int i = 0; i <= 2123; i = i + 79) {
            if (i >= startYear && i <= endYear) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}