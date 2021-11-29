package com.sviatukhov;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    1) На базе примера добавить 2 недостающих фрукта:
lemon 228g, 30.90 грн/кг
banana 230g, 28.80 грн/кг
И вывести суммарную стоимость(суммув чека). Округлить стоимость каждого фрукта до копеек.
https://github.com/akadatsky/fruits20211122
*) Сделать это задание путем форка оригинально репозитория на github, доработать и сделать push в свой fork.
Также можно послать pull request со своими доработками.
     */

    public static void main(String[] args) {

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 11.5, 232);

        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);

        Fruit yellowLemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);

        Fruit yellowBanana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(redApple);
        fruits.add(greenApple);
        fruits.add(yellowLemon);
        fruits.add(yellowBanana);

        double sum = 0.0;

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            BigDecimal result = new BigDecimal((fruit.getPricePerKg() * fruit.getWeight() / 1000.0));
            result = result.setScale(2, RoundingMode.HALF_UP);
            double rez = result.doubleValue();
            sum += rez;
        }

        System.out.println(sum);

    }
}

