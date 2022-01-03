package com.bridgelabz.workshop;

import java.util.ArrayList;

public class Laddu extends Sweet {
    public Laddu() {
        name = "Laddu";
        shape = shape.ROUND;
        color = color.YELLOW;
        price = 10;
        ingredients=new ArrayList();
        ingredients.add("sugar");
        ingredients.add("flour");
    }
}
