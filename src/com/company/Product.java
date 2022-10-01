package com.company;

public abstract class Product {
    protected int price; // ��������� ��������
    protected int orders; // ���������� ������� ��������

    Product(int price, int orders) { // ����������� ������ Product
        this.price = price;
        this.orders = orders;
    }

    abstract String getName(); // �������� ������������ ��������
    abstract int getNumber(); // �������� ����� ��������
    abstract int getIncome(); // �������� ������� � ����� �������
    abstract int getCommonIncome(); // �������� ������� � ������
}
