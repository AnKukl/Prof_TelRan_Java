package com.proftelran.org.lessonsixteen.searchengine;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;

public class IntegerPredicate implements Predicate<Product> {

    private int referenceValue; //Значение с которым будем сравнивать

    private IntegerOperator operator;

    private String propertyName; // Имя свойства

    public IntegerPredicate() {

    }

    public void setReferenceValue(int referenceValue) {
        this.referenceValue = referenceValue;
    }


    public void setOperator(IntegerOperator operator) {
        this.operator = operator;
    }


    @Override
    public boolean test(Product product) {
        System.out.println("Products value = " + product.getIntegerProperties().get(propertyName));
        if (product.getIntegerProperties().containsKey(propertyName)) {
            if (IntegerOperator.EQUAL.equals(operator)) {
                return product.getIntegerProperties().get(propertyName).equals(referenceValue);
            }
            if (IntegerOperator.NOT_EQUAL.equals(operator)) {
                return !product.getIntegerProperties().get(propertyName).equals(referenceValue);
            }
            if (IntegerOperator.LESS_THAN.equals(operator)) {
                return product.getIntegerProperties().get(propertyName) < referenceValue;
            }
            if (IntegerOperator.GREATER_THAN.equals(operator)) {
                return product.getIntegerProperties().get(propertyName) > referenceValue;
            }
            if (IntegerOperator.LESS_OR_EQUAL_THAN.equals(operator)) {
                return product.getIntegerProperties().get(propertyName) <= referenceValue;
            }
            if (IntegerOperator.GREATER_OR_EQUAL_THAN.equals(operator)) {
                return product.getIntegerProperties().get(propertyName) >= referenceValue;
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
        if (!product.getIntegerProperties().containsKey(propertyName.toLowerCase())) {
            System.out.println("No such trait");
            start(products);
            return;
        }
        this.propertyName = propertyName;
        System.out.println("Enter comparison sign: \nExample -> >/</>=/<=/=/!=");
        String sign = scanner.nextLine();
        switch (sign) {
            case ">" -> setOperator(IntegerOperator.GREATER_THAN);
            case "<" -> setOperator(IntegerOperator.LESS_THAN);
            case ">=" -> setOperator(IntegerOperator.GREATER_OR_EQUAL_THAN);
            case "<=" -> setOperator(IntegerOperator.LESS_OR_EQUAL_THAN);
            case "=" -> setOperator(IntegerOperator.EQUAL);
            case "!=" -> setOperator(IntegerOperator.NOT_EQUAL);
            default -> {
                System.out.println("Try again");
                start(products);
                return;
            }
        }
        System.out.println("Enter value of comparison: ");
        double value = scanner.nextDouble();
        setReferenceValue((int) value);
        System.out.println("Product meets search characteristics: " + test(product));
    }


}
