package com.company;

public class Pie extends Product{
    private String name = "Пирог"; // наименование продукта
    static int number = 1; // переменная-счетчик
    private int numberPie; // номер пирога
    private int cost; // себестоимость пирога

    Pie(int price, int cost, int orders) { // конструктор класса
        super(price, orders); // вызов конструктора суперкласса
        this.cost = cost;
        this.numberPie = number++;
    }

    public String getName() { return this.name; } // получить наименование продукта

    public int getNumber() { return numberPie; } // получить номер пирога

    public int getIncome() { return this.price - this.cost; } // получить прибыль с одной позиции

    public int getCommonIncome() { return this.getIncome() * this.orders; } // получить прибыль с партии
}

