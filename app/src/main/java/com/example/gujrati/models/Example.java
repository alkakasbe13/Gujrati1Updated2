package com.example.gujrati.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("product")
    @Expose
    private List<Product> product = null;

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}