package org.example.optional;

public class DealWithOptional {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        // 1. 에러 던지기
        Student null1 = studentRepository.findStudentByName("존재하지않는학생이름")
                .orElseThrow(()-> new RuntimeException("존재하지 않는 학생 이름입니다!"));

        // 2. default 객체 반환하기
        Student null2 = studentRepository.findStudentByName("존재하지않는학생이름")
                .orElse(new Student("이제존재하게된학생이름",7));

        // 3. 일정로직 수행 후 default 객체 반환하기
        Student null3 = studentRepository.findStudentByName("존재하지않는학생이름")
                .orElseGet(() -> {
                    System.out.println("존재하지 않을 때 수행되는 Supplier 람다식입니다.");
                    return new Student("이제존재하게된학생이름",7);
                });
    }
}
