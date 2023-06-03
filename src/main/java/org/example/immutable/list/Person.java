package org.example.immutable.list;

import java.util.ArrayList;
import java.util.List;

public final class Person {
    private final String name;
    private final List<Food> favoriteFoods;

    public Person(String name, List<Food> favoriteFoods) {
        this.name = name;
        this.favoriteFoods = copy(favoriteFoods);
    }

    public String getName() {
        return this.name;
    }
    public List<Food> getFavoriteFoods() {
        return copy(favoriteFoods);
    }
    public List<Food> copy(List<Food> foods) {
        List<Food> copied = new ArrayList<>();
        foods.forEach(food -> copied.add(new Food(food.getName())));
        return copied;
    }
}
