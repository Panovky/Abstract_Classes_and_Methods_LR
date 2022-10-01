package com.company;

public class Main {

    public static void main(String[] args) {

        Product[] array = new Product[] { // ������ ��������-���������: ���� � �������
                new Coffee(20, 2, 10, 5),
                new Pie(120, 100, 5),
                new Coffee(15, 7, 5, 10),
                new Coffee(10, 5, 0, 5),
                new Pie(90, 60, 8)
        };

        int N = array.length; // ���������� ������� ��������
        int income; // ������� � ������ ��������
        int maxIndex = 0, minIndex = 0; // ������� �������� � ������������ � ����������� ��������
        int maxIncome = 0, minIncome = 0; // ������������ � ����������� ������� � ��������
        int sumIncome = 0; // ����� �������

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

        System.out.printf("����� ���������� �������: %s %d.\n",
                array[maxIndex].getName().toLowerCase(), array[maxIndex].getNumber());
        System.out.printf("����� �������������� �������: %s %d.\n",
                array[minIndex].getName().toLowerCase(), array[minIndex].getNumber());
        System.out.printf("������� �������: %d.\n", sumIncome/N);

        for (int i = 0; i < N; i++) {
            System.out.printf("%s %d: ������� � ������� - %d, ������� � ������ - %d.\n",
                    array[i].getName(), array[i].getNumber(), array[i].getIncome(), array[i].getCommonIncome());
        }
    }
}
