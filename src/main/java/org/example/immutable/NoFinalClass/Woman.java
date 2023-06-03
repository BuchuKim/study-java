package org.example.immutable.NoFinalClass;


public class Woman extends Person {
    private String newName;
    public Woman(String name, Food favoriteFood) {
        super(name,favoriteFood);
        newName = name;
    }
    public void setName(String name) {
        newName = name;
    }
    @Override
    public String getName() {
        return this.newName;
    }
}
