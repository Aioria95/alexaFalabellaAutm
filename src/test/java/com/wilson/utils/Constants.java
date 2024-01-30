package com.wilson.utils;

public enum Constants {

    PRODUCT_NAME("Samsung s23");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
