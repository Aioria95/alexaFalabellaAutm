package com.wilson.utils;

public enum Constants {

    PRODUCT_NAME("Cortinas");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
