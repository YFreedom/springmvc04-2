package com.zhidi.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhidi.dao.IBaseDao;

@Repository
public class BaseDaoImpl<T, PK extends Serializable> implements IBaseDao<T, PK>{
	
	private Class entityClass;
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	
	public BaseDaoImpl() {
		//通过反射机制获取具体的类
		Class clz = getClass();
		//返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
		Type type = clz.getGenericSuperclass();
		//类型在具体有子类继承时就能确定
		if(type instanceof ParameterizedType){
			//获取实际参数类型数组
			Type[] types = ((ParameterizedType) type).getActualTypeArguments();
			//向下转型
			entityClass = (Class)types[0];
		}
	}


	@Override
	public void save(T entity) {
		getSession().save(entity);
	}

	@Override
	public void delete(PK id) {
		T t = get(id);
		getSession().delete(t);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public T get(PK id) {
		T t = (T) getSession().get(entityClass, id);
		return t;
	}


	@Override
	public List<T> getAll() {
		return getSession().createQuery(" from "+entityClass.getName()).list();
	}

}
