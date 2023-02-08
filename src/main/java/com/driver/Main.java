package com.driver;

public class Main {
    public class Product
    {
        public int product(int x, int y) {}
        public int product(int x, int y, int z) {}
        public double product(double x, double y) {}
    }

    public void main(String[] args) {
        Product p = new Product();
        p.product(10,20);
        p.product(10,20,30);
        p.product(13,14);
    }
}