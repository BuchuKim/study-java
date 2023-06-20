package org.example.oop.inheritance;

public class AttackDriver {
    public static void main(String[] args) {
        Character [] characters = new Character[3];
        characters[0] = new Character();
        characters[1] = new Magician();
        characters[2] = new Warrior();

        for (Character c : characters) {
            c.attack();
        }
    }
}
