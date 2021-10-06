package com.example.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle( "웹개발의 봄, Spring" );
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
    }
}
