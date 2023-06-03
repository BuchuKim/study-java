package org.example.immutable.NoFinalClass;

public class Example {
    public static void main(String[] args) {
        // up casting
        Person person = new Woman("부추", new Food("떡볶이"));

        // down casting
        Woman woman = (Woman) person;
        woman.setName("여자부추");

        // 여자부추?!
        System.out.println(person.getName());
        System.out.println(woman);
        System.out.println(person);
    }
}
