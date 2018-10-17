package com.accp.hanting.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.hanting.dao.YzxDao;
import com.accp.hanting.pojo.Admin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class YzxBiz {
	@Autowired
	private YzxDao dao;
	/**
	 * 分页查询所有管理员
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Admin> findPaperByPage(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Admin>(dao.query());
	}
}
