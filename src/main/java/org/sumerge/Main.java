package org.sumerge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        Course xyz = new Course("XYZ","Course1");
        Course abc = new Course("ABC", "Course2");

        Student mohamed = new Student("Mohamed", Arrays.asList(xyz,abc), "2024");
        Student ahmed = new Student("Ahmed", Arrays.asList(xyz), "2023");
        Student adel = new Student("Adel", Arrays.asList(abc), "2023");

        List<Student> students = Arrays.asList(mohamed,ahmed,adel);

        Runnable usingCode = () -> {
            System.out.print("Course code: ");
            Scanner input = new Scanner(System.in);
            String courseCode = input.nextLine();
            if(courseCode.length()!=3) {
                System.out.println("Invalid Code");
                return;
            }
            students.stream().filter(student -> student.isEnrolled(courseCode))
                    .forEach(student -> System.out.println(student + "\n"+"------------------------"));
        };

        Consumer<Course> usingCourse = (Course course) -> students.stream().filter(student -> student.courses.contains(course))
                .forEach(student -> System.out.println(student + "\n"+"------------------------"));

        // input course code via scanner
        usingCode.run();
        // pass course object (xyz or abc)
        //usingCourse.accept(xyz);
    }
}
