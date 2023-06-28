package org.example.optional;

public class Client {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        studentRepository.findStudentByName("김부추").ifPresentOrElse(
                System.out::println,() -> {
                    System.out.println("김부추라는 학생은 없는데요?");
                });

        studentRepository.findStudentByName("황부추").ifPresentOrElse(
                System.out::println,() -> {
                    System.out.println("황부추라는 학생은 없는데요?");
                });
    }
}
