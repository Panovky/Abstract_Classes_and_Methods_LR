package com.company;

public class Coffee extends Product {
    private String name = "Кофе"; // наименование продукта
    static int number = 1; // переменная-счетчик
    private int numberCoffee; // номер кофе
    private int waterCost; // себестоимость воды
    private int grainCost; // себестоимость зёрен

    Coffee(int price, int waterCost, int grainCost, int orders) { // конструктор класса
        super(price, orders); // вызов конструктора суперкласса
        this.waterCost = waterCost;
        this.grainCost = grainCost;
        this.numberCoffee = number++;
    }

    public String getName() { return this.name; } // получить наименование продукта

    public int getNumber() { return numberCoffee; } // получить номер кофе

    public int getIncome() { return this.price - this.waterCost - this.grainCost; } // получить прибыль с одной позиции

    public int getCommonIncome() { return this.getIncome() * this.orders; } // получить прибыль с партии
}

