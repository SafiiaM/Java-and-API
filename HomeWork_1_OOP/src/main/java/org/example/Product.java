package org.example;



public class Product {
    private String name;
    private int price;
    private int rating;
    private static Integer count;

    static {
        count = 1;
    }

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        count++;
    }

    public Product() {
        this((" newProduct_ " + count), 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
        else System.out.println("Название продукта отсутствует или не введено");

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
        else System.out.println("Цена продукта не может быть отрицательной");
    }

    public void setRating(int rating) {
        if (rating > 0)
            this.rating = rating;
        else System.out.println(" Рейтинг продукта не может быть отрицательным");
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", name, price, rating);
    }
}

