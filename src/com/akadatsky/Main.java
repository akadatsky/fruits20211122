package com.akadatsky;

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

        System.out.println(String.format("Your basket is %.02f hrn.", sum));
    }
}
