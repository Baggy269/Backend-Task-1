package org.sumerge;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    String name;
    List<Course> courses;
    String gradYear;

    public Student(String name, List<Course> courses, String gradYear){
        this.name = name;
        this.courses = courses;
        if(gradYear.matches("(20[0-9][0-9])"))
            this.gradYear = gradYear;
        else
            System.out.println("Invalid Year");
    }

    public String toString(){
        String output = "Name: " + name + "\n" + "Courses: ";
        for (Course course : courses) {
            output+=course.code+", ";
        }
        output = output.substring(0,output.length()-2) + "\n" + "Graduation Year: " + gradYear;
        return output;
    }

    public boolean isEnrolled(String code){
        for(Course course : courses){
             if(course.code.equals(code))
                 return true;
        }
        return false;
    }
}
