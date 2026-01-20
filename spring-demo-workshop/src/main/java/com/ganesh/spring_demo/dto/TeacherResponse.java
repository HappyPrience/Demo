package com.ganesh.spring_demo.dto;

import com.ganesh.spring_demo.model.Teacher;

public class TeacherResponse {
    private String message;
    private Teacher teacher;

    public TeacherResponse(String message, Teacher teacher) {
        this.message = message;
        this.teacher = teacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
