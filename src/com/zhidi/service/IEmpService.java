package com.zhidi.service;

import java.util.List;

import com.zhidi.entity.Emp;

public interface IEmpService {

	void save(Emp entity);
	
	void delete(Integer id);
	
	void update(Emp entity);
	
	Emp get(Integer id);
	
	List getAll();
}
