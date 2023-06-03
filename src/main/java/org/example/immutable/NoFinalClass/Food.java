package org.example.immutable.NoFinalClass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Food {
    String name;
    public Food(String name) {
        this.name = name;
    }
}
