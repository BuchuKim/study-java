package org.example.enumstudy.withenum;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public enum Genre {
    RPG("rpg 장르", Arrays.asList("MAPLE_STORY","LOST_ARK")),
    FPS("fps 장르", Arrays.asList("OVER_WATCH")),
    SIMULATION("시뮬레이션 장르", Arrays.asList("ANIMAL_CROSSING")),
    OTHER("기타 장르", Arrays.asList("LEAGUE_OF_LEGEND")),;

    final String description;
    final List<String> gameList;

    public static Genre getGenre(String gameName) {
        return Arrays.stream(Genre.values()) // 각 장르에 대해
                .filter(genre -> genre.hasGame(gameName)) // gameName을 포함하는 장르가 있다?
                .findAny() // return 해
                .orElse(OTHER);
    }

    boolean hasGame(String gameName) {
        // gameName에 해당하는 장르 enum return
        return gameList.stream().anyMatch(gameName::equals);
    }

    public static void printGenre(String gameName) {
        System.out.println(gameName + "의 장르는 " + getGenre(gameName) + "입니다.");
    }
}
