package org.example.map;

import java.util.HashMap;

public class MapStudy {
    public static void main(String[] args) {
        HashMap<String,Integer> movies = new HashMap<>();

        movies.put("슈퍼 마리오 브라더스",100);
        movies.put("범죄도시",80);
        movies.put("기생충",50);

        // 100
        System.out.println(movies.get("슈퍼 마리오 브라더스"));
        if (movies.get("임의의 영화")==null) {
            System.out.println("해당하는 영화는 없습니다!");
        }

        movies.replace("기생충",1000);
        System.out.println(movies.get("기생충")); // 1000

        movies.remove("범죄도시");
        System.out.println(movies.get("범죄도시")); // null

    }
}
