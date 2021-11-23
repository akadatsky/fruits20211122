package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class SelfCheckout {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public double calculatePrice() {
        double sum = 0;
        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            sum += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }

        return sum;
    }
}
