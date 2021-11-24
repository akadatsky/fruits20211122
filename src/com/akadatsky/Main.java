package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit();
        redApple.setType(Fruit.Type.APPLE);
        redApple.setColor(Color.RED);
        redApple.setWeight(232);
        redApple.setPricePerKg(11.5);
        System.out.println(redApple);
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230)
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(redApple);
        fruits.add(greenApple);

        // lemon  228g, 30.90
        // banana  230g, 28.80

        double sum = 0;

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            sum += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        System.out.println(sum);

    }
}
