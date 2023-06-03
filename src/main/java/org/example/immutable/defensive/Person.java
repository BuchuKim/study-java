package org.example.immutable.defensive;

public final class Person {
    private final String name;
    private final Food favoriteFood;

    public Person(String name, Food favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return this.name;
    }
    public Food getFavoriteFood() {
        return new Food(this.favoriteFood.getName());
    }
}
