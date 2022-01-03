package com.bridgelabz.workshop;

import java.util.List;

public class Sweet {
    enum Shape {
        TRIANGLE, SQUARE, ROUND
    }

    enum Color {
        RED, GREEN, YELLOW, BLACK, BLUE, WHITE
    };

    String name;
    Color color;
    Shape shape;
    int price;
    List<String> ingredients;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + ((shape == null) ? 0 : shape.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sweet other = (Sweet) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (ingredients == null) {
            if (other.ingredients != null)
                return false;
        } else if (!ingredients.equals(other.ingredients))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (shape == null) {
            if (other.shape != null)
                return false;
        } else if (!shape.equals(other.shape))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Sweet [name=" + name + ", color=" + color + ", shape=" + shape + ", price=" + price + ", ingredients="
                + ingredients + "]";
    }
}
