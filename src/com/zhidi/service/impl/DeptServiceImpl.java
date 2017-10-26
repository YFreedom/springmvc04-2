package com.zhidi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidi.dao.IDeptDao;
import com.zhidi.entity.Dept;
import com.zhidi.service.IDeptService;
@Service
public class DeptServiceImpl implements IDeptService{
	@Autowired
	private IDeptDao deptDao;

	@Override
	public void save(Dept entity) {
		deptDao.save(entity);
	}

	@Override
	public void delete(Integer id) {
		deptDao.delete(id);
	}

	@Override
	public void update(Dept entity) {
		deptDao.update(entity);
	}

	@Override
	public Dept get(Integer id) {
		return deptDao.get(id);
	}

	@Override
	public List<Dept> getAll() {		
		return deptDao.getAll();
	}

}
