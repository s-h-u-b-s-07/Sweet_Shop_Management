package com.bridgelabz.workshop;

import java.util.ArrayList;

public class Rasgulla extends Sweet {
    public Rasgulla() {
        name = "Rasgulla";
        shape = shape.ROUND;
        color = color.BLACK;
        price = 20;
        ingredients=new ArrayList();
        ingredients.add("sugar");
    }
}
