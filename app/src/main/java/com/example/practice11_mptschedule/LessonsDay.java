package com.example.practice11_mptschedule;

public class LessonsDay {

    String pair;
    String discipline;
    String lecturer;

    public LessonsDay(String pair, String discipline, String lecturer){
        this.pair = pair;
        this.discipline= discipline;
        this.lecturer = lecturer;
    }

    public String getPair() {
        return pair;
    }
    public String getDiscipline() {
        return discipline;
    }
    public String getLecturer() {
        return lecturer;
    }
}
