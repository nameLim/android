package com.example.week01.prac;

public class Course {
    private String title;
    private String tutor;
    private int days;

    // 이렇게 아무런 파라미터가 없는 생성자를 기본생성자 라고 부릅니다.
    public Course() {

    }

    public Course(String title, String tutor, int days) {
        // this 는 "이것" 이죠? 클래스 변수를 가리킵니다.
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public int getDays() {
        return this.days;
    }
}
