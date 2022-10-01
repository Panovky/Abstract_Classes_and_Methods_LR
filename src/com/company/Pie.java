package com.company;

public class Pie extends Product{
    private String name = "�����"; // ������������ ��������
    static int number = 1; // ����������-�������
    private int numberPie; // ����� ������
    private int cost; // ������������� ������

    Pie(int price, int cost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.cost = cost;
        this.numberPie = number++;
    }

    public String getName() { return this.name; } // �������� ������������ ��������

    public int getNumber() { return numberPie; } // �������� ����� ������

    public int getIncome() { return this.price - this.cost; } // �������� ������� � ����� �������

    public int getCommonIncome() { return this.getIncome() * this.orders; } // �������� ������� � ������
}

