package org.example.enumstudy.basic;

public class Client {
    public static void main(String[] args) {
        for (Game game : Game.values()) {
            game.printInfo();
        }
    }
}
