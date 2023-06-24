package org.example.enumstudy.noenum;

public class Client {
    public static void main(String[] args) {
        Game [] games = {new Game("MAPLE_STORY","메이플스토리",20),
                new Game("LOST_ARK","로스트 아크", 5),
                new Game("ANIMAL_CROSSING","동물의 숲", 22),
                new Game("OVER_WATCH","오버워치", 7),
                new Game("LEAGUE_OF_LEGEND","리그 오브 레전드",14)};

        for (Game game : games) {
            if ("MAPLE_STORY".equals(game.name) || "LOST_ARK".equals(game.name)) {
                System.out.println("RPG 장르");
            } else if ("OVER_WATCH".equals(game.name)) {
                System.out.println("FPS 장르");
            } else if ("ANIMAL_CROSSING".equals(game.name)) {
                System.out.println("시뮬레이션 장르");
            } else {
                System.out.println("기타 장르");
            }
        }
    }
}
