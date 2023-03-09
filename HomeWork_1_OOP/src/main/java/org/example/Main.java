package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product kiwi = new Product("kiwi", 200, 7);
        Product persimmon = new Product("persimmon", 300, 8);
        Product apple = new Product("apple", 150, 10);

        Product egg = new Product("egg", 80, 10);
        Product sourCream = new Product("sourCream", 120, 8);

        Product mutton = new Product("mutton", 300, 6);
        Product turkey = new Product("turkey", 400, 7);

//        Product[] fruitsProduct = {kiwi, persimmon, apple};
//        Product[] dairyProduct = {egg, sourCream};
//        Product[] meetProduct = {mutton, turkey};

        List<Product> fruitsProduct = new ArrayList<>();
        List<Product> dairyProduct = new ArrayList<>();
        List<Product> meetProduct = new ArrayList<>();

        fruitsProduct.add(kiwi);
        fruitsProduct.add(persimmon);
        fruitsProduct.add(apple);

        dairyProduct.add(egg);
        dairyProduct.add(sourCream);

        meetProduct.add(mutton);
        meetProduct.add(turkey);

        Category fruits = new Category("fruits", fruitsProduct);
        Category dairy = new Category("dairy", dairyProduct);
        Category meet = new Category("meet", meetProduct);

        show(fruits, dairy, meet);

        User user1 = new User();
//        User user2 = new User();
//        User user3 = new User();

        System.out.println("||||||||||||||||||||||||||||||||||");

        user1.add(fruits.getProduct(0));
        user1.add(dairy.getProduct( 1));

        System.out.println(user1.getName() + ":");
        System.out.println(user1.toString());

        System.out.println("||||||||||||||||||||||||||||||||||");
        show(fruits, dairy, meet);

    }


    public static void show(Category fruits, Category dairy, Category meet) {
        System.out.println(fruits.getName() + ":");
        System.out.println(fruits.toString());
        System.out.println(dairy.getName() + ":");
        System.out.println(dairy.toString());
        System.out.println(meet.getName() + ":");
        System.out.println(meet.toString());
    }
}