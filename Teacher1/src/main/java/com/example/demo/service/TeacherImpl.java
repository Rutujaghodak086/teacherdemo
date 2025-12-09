package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
@Service
public class TeacherImpl implements TeacherService {

	private TeacherRepository tr;
	@Override
	public void add(Teacher t) {
		// TODO Auto-generated method stub
		tr.save(t);
		
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public Teacher search(Integer id) {
		// TODO Auto-generated method stub
		return tr.findById(id).get();
	}

}
