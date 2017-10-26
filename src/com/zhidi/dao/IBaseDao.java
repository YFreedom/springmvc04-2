package com.zhidi.dao;

import java.util.List;

public interface IBaseDao<T,PK> {
	/**
	 * 新增
	 * @param entity
	 */
	void save(T entity);
	/**
	 * 删除
	 * @param id
	 */
	void delete(PK id);
	/**
	 * 修改
	 * @param entity
	 */
	void update(T entity);
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	T get(PK id);
	
	List<T> getAll();
}
