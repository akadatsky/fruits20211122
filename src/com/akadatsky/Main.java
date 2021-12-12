package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 11.5, 232);
        System.out.println(redApple);
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);
        System.out.println(greenApple);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);
        System.out.println(lemon);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230);
        System.out.println(banana);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(redApple);
        fruits.add(greenApple);
        fruits.add(lemon);
        fruits.add(banana);

        // lemon  228g, 30.90
        // banana  230g, 28.80

        double sum = 0;

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            sum += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        System.out.print("Сумма оплаты:");
        System.out.printf("%.2f", sum);

    }
}
