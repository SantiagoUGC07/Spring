package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService; // aqui se pasa la interface

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService; // aqui se genera la dependencia de la interface con un constructor
        //puede obtener objeto de la clase a, si esta, esta impleentada en otra clase b y por este medio se puede realizar colocando en la clase b @service
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
    	Student student1 = new Student("1",1,"uriel garcia", "cordova", 8);
    	Student student2 = new Student("2",3,"daniel", "carvajal", 23);
    	Student student3 = new Student("3",5,"jenny", "rivera", 33);
    	studentService.add(student1);
    	studentService.add(student2);
    	studentService.add(student3);
    	return studentService.findById( id );
    }

}
