package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;


    private Basket(List<Product> products) {
        this.products = products;
    }

    public Basket() {
        this(new ArrayList<Product>());
    }

    public List<Product> getProducts() {
        if (products.size() == 0)
            System.out.println("Корзина пуста, добавьте товары в корзину");
        return products;
    }

    public void setProducts(List<Product> products) {
        if (products.size() > 0)
            this.products = products;
        else System.out.println("Корзина пуста, добавьте товары в корзину");
    }

    public void add(Product newProduct){
        products.add(newProduct);
    }

    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < products.size();j++) {
            sb.append(products.get(j).toString()).append("\n");
        }
        return sb.toString();
    }
}
