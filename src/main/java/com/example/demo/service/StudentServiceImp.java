package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
//se coloca service en esta clase para poder obtener los objetos de student service
@Service
public class StudentServiceImp implements StudentService{

	private final List<Student> studentList = new ArrayList<Student>();

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
		
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(String id) {
		// TODO Auto-generated method stub
		return studentList.get(Integer.parseInt(id));
	}
	
	
	
	
	
	
}
