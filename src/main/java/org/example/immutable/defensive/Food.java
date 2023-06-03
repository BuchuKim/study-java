package org.example.immutable.defensive;

import lombok.Getter;
import lombok.Setter;

public class Food {
    private String name;
    public Food(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
