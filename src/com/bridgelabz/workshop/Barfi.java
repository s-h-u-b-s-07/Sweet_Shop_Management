package com.bridgelabz.workshop;

import java.util.ArrayList;

public class Barfi extends Sweet {
    public Barfi() {
        name = "Barfi";
        shape = shape.SQUARE;
        color = color.WHITE;
        price = 30;
        ingredients=new ArrayList();
        ingredients.add("sugar");
    }
}
