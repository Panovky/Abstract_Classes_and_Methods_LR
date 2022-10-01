package com.company;

public class Main {

    public static void main(String[] args) {

        Product[] array = new Product[] { // массив объектов-продуктов: кофе и пирогов
                new Coffee(20, 2, 10, 5),
                new Pie(120, 100, 5),
                new Coffee(15, 7, 5, 10),
                new Coffee(10, 5, 0, 5),
                new Pie(90, 60, 8)
        };

        int N = array.length; // количество позиций продукта
        int income; // прибыль с одного продукта
        int maxIndex = 0, minIndex = 0; // индексы продукта с максимальной и минимальной прибылью
        int maxIncome = 0, minIncome = 0; // максимальная и минимальная прибыль с продукта
        int sumIncome = 0; // общая прибыль

        for (int i = 0; i < N; i++) {

            income = array[i].getIncome();
            sumIncome += income;

            if (i == 0) {
                minIncome = income;
                maxIncome = income;
            }

            if (income > maxIncome) {
                maxIncome = income;
                maxIndex = i;
            }

            if (income < minIncome) {
                minIncome = income;
                minIndex = i;
            }
        }

        System.out.printf("Самый прибыльный продукт: %s %d.\n",
                array[maxIndex].getName().toLowerCase(), array[maxIndex].getNumber());
        System.out.printf("Самый малоприбыльный продукт: %s %d.\n",
                array[minIndex].getName().toLowerCase(), array[minIndex].getNumber());
        System.out.printf("Средняя прибыль: %d.\n", sumIncome/N);

        for (int i = 0; i < N; i++) {
            System.out.printf("%s %d: прибыль с единицы - %d, прибыль с партии - %d.\n",
                    array[i].getName(), array[i].getNumber(), array[i].getIncome(), array[i].getCommonIncome());
        }
    }
}
