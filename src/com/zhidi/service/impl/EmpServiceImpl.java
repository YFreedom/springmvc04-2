package com.zhidi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zhidi.dao.IEmpDao;
import com.zhidi.entity.Emp;
import com.zhidi.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService{
	@Autowired
	private IEmpDao empDao;

	@Override
	public void save(Emp entity) {
		empDao.save(entity);
	}

	@Override
	public void delete(Integer id) {
		empDao.delete(id);
	}

	@Override
	public void update(Emp entity) {
		empDao.update(entity);
	}

	@Override
	public Emp get(Integer id) {
		
		return empDao.get(id);
	}

	@Override
	public List getAll() {
		return empDao.getAll();
	}

}
