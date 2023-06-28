package org.example.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private final List<Student> attendance = new ArrayList<>();

    StudentRepository() {
        attendance.add(new Student("김부추",1));
        attendance.add(new Student("박부추",2));
        attendance.add(new Student("이부추",3));
        attendance.add(new Student("전부추",4));
        attendance.add(new Student("최부추",5));
        attendance.add(new Student("한부추",6));
    }


    public Optional<Student> findStudentByName(String name) {
        return attendance.stream()
                .filter(student -> student.hasSameName(name))
                .findAny();
    }
}
