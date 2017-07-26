package org.rxjy.book.service.impl;

import java.util.Collection;

import org.rxjy.book.dao.TypeDao;
import org.rxjy.book.dao.impl.TypeDaoImpl;
import org.rxjy.book.service.TypeService;
import org.rxjy.book.vo.Type;

/**
 * 书本种类业务实现类
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class TypeServiceImpl implements TypeService {

	private TypeDao dao;
	
	public TypeServiceImpl(TypeDao dao) {
		this.dao = dao;
	}
	
	public Collection<Type> query(String name) {
		return dao.findByName(name);
	}

	public Collection<Type> getAll() {
		return dao.find();
	}

	public Type add(Type type) {
		String id = dao.add(type);
		return get(id);
	}

	public Type update(Type type) {
		String id = dao.update(type);
		return get(id);
	}
	
	public Type get(String id) {
		return dao.find(id);
	}

}
