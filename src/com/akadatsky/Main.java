package com.akadatsky;

/* 1) На базе примера добавить 2 недостающих фрукта:
lemon 228g, 30.90 грн/кг
banana 230g, 28.80 грн/кг
И вывести суммарную стоимость(суммув чека). Округлить стоимость каждого фрукта до копеек.

https://github.com/akadatsky/fruits20211122

 */
public class Main {

    public static void main(String[] args) {
        SelfCheckout selfCheckout = new SelfCheckout();
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 11.50, 232);
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);
        Fruit yellowLemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);
        Fruit yellowBanana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230);
        selfCheckout.add(redApple);
        selfCheckout.add(greenApple);
        selfCheckout.add(yellowLemon);
        selfCheckout.add(yellowBanana);
        double sum = selfCheckout.calculatePrice();

        System.out.println(String.format("Your charge is %.02f hrn.", sum));
    }
}
