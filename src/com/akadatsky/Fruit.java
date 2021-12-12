package com.akadatsky;

public class Fruit {
    public enum Type {
        APPLE, BANANA, LEMON
    }

    private Type type;
    private Color color;
    private double pricePerKg;
    private int weight;

    public Fruit() {
    }

    public Fruit(Type type, Color color, double pricePerKg, int weight) {
        this.type = type;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
               "type=" + type +
               ", color=" + color +
               ", pricePerKg=" + pricePerKg +
               ", weight=" + weight +
               '}';
    }
}

