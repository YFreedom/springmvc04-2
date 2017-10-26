package com.zhidi.service;

import java.util.List;

import com.zhidi.entity.Dept;

public interface IDeptService {

	void save(Dept entity);
	
	void delete(Integer id);
	
	void update(Dept entity);
	
	Dept get(Integer id);
	
	List<Dept> getAll();
}
