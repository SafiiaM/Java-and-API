package org.example;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;
    private static Integer count;

    static{
        count = 1;
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
        count++;
    }

    public Category(String name) {
        this(name,null);
    }

    public Category() {
        this(("newCategory_" + count), null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < products.size();j++) {
            sb.append(products.get(j).toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
        else System.out.println(" Введите наименование категории ");
    }

    public Product getProduct(int number) {
        if (products.size() == 0) {
            System.out.println("Товары в категории отсутствуют");
            return null;
        }
        else if (products.get(number) == null){
            System.out.println("Товар не найден");
            return null;
        }
        else {
            Product take = products.get(number);
            products.remove(number);
            return take;
        }
    }


}
