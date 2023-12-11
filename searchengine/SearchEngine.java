package com.proftelran.org.lessonsixteen.searchengine;

import java.util.*;

public class SearchEngine {

    public static void main(String[] args) {
        //Creating of integer Products traits
        Map<String, Integer> integerTeapotTraits = new HashMap<>();
        integerTeapotTraits.put("number of products", 300);
        integerTeapotTraits.put("date of creating", 2003);
        integerTeapotTraits.put("number of customers", 468);
        integerTeapotTraits.put("price", 600);

        Map<String, Integer> integerLaptopTraits = new HashMap<>();
        integerLaptopTraits.put("number of products", 37461);
        integerLaptopTraits.put("date of creating", 2015);
        integerLaptopTraits.put("number of customers", 46281);
        integerLaptopTraits.put("price", 2500);
        //Creating of string Products traits
        Map<String, String> stringTeapotTraits = new HashMap<>();
        stringTeapotTraits.put("color", "black");
        stringTeapotTraits.put("manufacturer", "atlant");
        stringTeapotTraits.put("shop", "5element");

        Map<String, String> stringLaptopTraits = new HashMap<>();
        stringLaptopTraits.put("color", "grey");
        stringLaptopTraits.put("manufacturer", "asus");
        stringLaptopTraits.put("shop", "mediamarket");

        //Creating of products
        Product product1 = new Product(1, "Teapot", stringTeapotTraits, integerTeapotTraits);
        Product product2 = new Product(2, "Laptop", stringLaptopTraits, integerLaptopTraits);
        //Creating of productsList
        List<Product> productList = new LinkedList<>();
        productList.add(product1);
        productList.add(product2);
        //Start program(Integer predicate)
        IntegerPredicate predictableIntegerCase = new IntegerPredicate();
        predictableIntegerCase.start((LinkedList<Product>) productList);

        StringPredicate predictableStringCase = new StringPredicate();
        predictableStringCase.start((LinkedList<Product>) productList);


    }
}
