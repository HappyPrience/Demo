package com.ganesh.spring_demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.ganesh.spring_demo.dto.TeacherResponse;
import com.ganesh.spring_demo.model.Teacher;
import com.ganesh.spring_demo.repository.TeacherRepository;

@Service
public class TeacherService {

    private final TeacherRepository studentRepository;

    public TeacherService(TeacherRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public TeacherResponse addTeacher(Teacher teacher){
        return new TeacherResponse("Teacher added successfully!",studentRepository.save(teacher));
    }

    public List<Teacher> getAllTeachers(){
        return studentRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Teacher deleteTeacherById(Long id){
        Teacher teacher = studentRepository.findById(id).orElse(null);
        if(Objects.nonNull(teacher)){
            studentRepository.deleteById(id);
            return teacher;
        } else {
            return null;
        }
    }
}
