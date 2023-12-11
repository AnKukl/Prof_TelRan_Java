package com.proftelran.org.lessonsixteen.searchengine;

import java.util.LinkedList;
import java.util.Scanner;

public class StringPredicate {
    private String referenceValue; //Значение с которым будем сравнивать

    private StringOperator operator;

    private String propertyName; // Имя свойства

    public StringPredicate() {

    }


    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
    }


    public void setOperator(StringOperator operator) {
        this.operator = operator;
    }

    public boolean test(Product product) {
        System.out.println("Products value = " + product.getStringProperties().get(propertyName));
        if (product.getStringProperties().containsKey(propertyName)) {
            if (StringOperator.EQUAL.equals(operator)) {
                return product.getStringProperties().get(propertyName).equals(referenceValue);
            }
            if (StringOperator.NOT_EQUAL.equals(operator)) {
                return !product.getStringProperties().get(propertyName).equals(referenceValue);
            }

        }

        return false;
    }

    public void start(LinkedList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        Product product = products.stream()
                .filter(x -> x.getName().equalsIgnoreCase(productName))
                .findAny()
                .orElse(null);

        if (product == null || !product.getName().equalsIgnoreCase(productName)) {
            System.out.println("No such product");
            start(products);
            return;
        }
        System.out.println("Enter property: ");
        String propertyName = scanner.nextLine();
        if (!product.getStringProperties().containsKey(propertyName.toLowerCase())) {
            System.out.println("No such trait");
            start(products);
            return;
        }
        this.propertyName = propertyName;
        System.out.println("Enter comparison sign: \nExample -> = / !=");
        String sign = scanner.nextLine();
        switch (sign) {
            case "=" -> setOperator(StringOperator.EQUAL);
            case "!=" -> setOperator(StringOperator.NOT_EQUAL);
            default -> {
                System.out.println("Try again");
                start(products);
                return;
            }
        }
        System.out.println("Enter value of comparison: ");
        String value = scanner.nextLine();
        setReferenceValue(value);
        System.out.println("Product meets search characteristics: " + test(product));
    }

}
