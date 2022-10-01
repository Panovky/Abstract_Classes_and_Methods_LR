package com.company;

public class Coffee extends Product {
    private String name = "����"; // ������������ ��������
    static int number = 1; // ����������-�������
    private int numberCoffee; // ����� ����
    private int waterCost; // ������������� ����
    private int grainCost; // ������������� ����

    Coffee(int price, int waterCost, int grainCost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.waterCost = waterCost;
        this.grainCost = grainCost;
        this.numberCoffee = number++;
    }

    public String getName() { return this.name; } // �������� ������������ ��������

    public int getNumber() { return numberCoffee; } // �������� ����� ����

    public int getIncome() { return this.price - this.waterCost - this.grainCost; } // �������� ������� � ����� �������

    public int getCommonIncome() { return this.getIncome() * this.orders; } // �������� ������� � ������
}

