package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 11.5, 232);
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(redApple);
        fruits.add(greenApple);
        fruits.add(banana);
        fruits.add(lemon);

        double sum = 0;

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            sum += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        System.out.printf("Общая сумма чека: %.2f грн", sum);
    }
}