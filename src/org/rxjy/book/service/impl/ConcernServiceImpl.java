package org.rxjy.book.service.impl;

import java.util.Collection;

import org.rxjy.book.dao.ConcernDao;
import org.rxjy.book.service.ConcernService;
import org.rxjy.book.vo.Concern;

/**
 * 出版社业务实现类
 * 
 * @author huangxingbo
 * @version  1.0
 *  */
public class ConcernServiceImpl implements ConcernService {

	private ConcernDao dao;
	
	public ConcernServiceImpl(ConcernDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Collection<Concern> getAll() {
		return dao.findAll();
	}

	@Override
	public Concern find(String id) {
		return dao.find(id);
	}

	@Override
	public Concern add(Concern c) {
		String id = dao.add(c);
		return find(id);
	}

	@Override
	public Concern update(Concern c) {
		//调用DAO方法修改对象
		String id = dao.update(c);
		//重新查找该对象
		return find(id);
	}

	@Override
	public Collection<Concern> query(String name) {
		return dao.findByName(name);
	}

}
