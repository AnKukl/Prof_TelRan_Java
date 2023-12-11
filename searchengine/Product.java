package com.proftelran.org.lessonsixteen.searchengine;

import java.util.Map;

public class Product {

    private final int id;

    private String name;

    // color - > Red
    // flavour -> apple

    private Map<String, String> stringProperties;

    private Map<String, Integer> integerProperties;

    public Product(int id, String name, Map<String, String> stringProperties, Map<String, Integer> integerProperties) {
        this.id = id;
        this.name = name;
        this.stringProperties = stringProperties;
        this.integerProperties = integerProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getStringProperties() {
        return stringProperties;
    }


    public Map<String, Integer> getIntegerProperties() {
        return integerProperties;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", stringProperties=" + stringProperties +
                ", integerProperties=" + integerProperties;
    }
}
