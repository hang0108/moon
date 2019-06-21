package com.qf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.dao.IDeptDao;
import com.qf.pojo.Dept;

@Service
public class DeptServiceImpl implements IDeptService{
	
	@Autowired
	private IDeptDao deptDao;

	@Override
	public List<Dept> getAllDepts() {
		return deptDao.getAllDepts();
	}

}
