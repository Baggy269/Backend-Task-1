package org.sumerge;

public class Course {
    String code;
    String name;
    static final String college = "FCISASU";

    public Course(String code, String name){
        if(code.length()==3)
            this.code = code;
        else
            System.out.println("Invalid Code");
        this.name = name;
    }

    public boolean equals(Course x){
        return code.equals(x.code) ? true : false;
    }
}
