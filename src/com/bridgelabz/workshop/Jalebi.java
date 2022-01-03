package com.bridgelabz.workshop;

import java.util.ArrayList;

public class Jalebi extends Sweet {
    public Jalebi() {
        name = "Jalebi";
        shape = shape.ROUND;
        color = color.RED;
        price = 30;
        ingredients=new ArrayList();
        ingredients.add("sugar");
    }
}
