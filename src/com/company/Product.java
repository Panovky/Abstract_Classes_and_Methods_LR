package com.company;

public abstract class Product {
    protected int price; // стоимость продукта
    protected int orders; // количество заказов продукта

    Product(int price, int orders) { // конструктор класса Product
        this.price = price;
        this.orders = orders;
    }

    abstract String getName(); // получить наименование продукта
    abstract int getNumber(); // получить номер продукта
    abstract int getIncome(); // получить прибыль с одной позиции
    abstract int getCommonIncome(); // получить прибыль с партии
}
