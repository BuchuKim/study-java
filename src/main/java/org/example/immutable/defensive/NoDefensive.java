package org.example.immutable.defensive;

public class NoDefensive {
    public static void main(String[] args) {
        Person person = new Person("부추",new Food("떡볶이"));
        person.getFavoriteFood().name = "짜장면";

        // 짜장면
        System.out.println(person.getFavoriteFood().name);
    }
}
