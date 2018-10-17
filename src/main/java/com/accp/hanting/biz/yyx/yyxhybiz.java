package com.accp.hanting.biz.yyx;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.hanting.dao.yyx.YyxHyDao;
import com.accp.hanting.pojo.User;
import com.accp.hanting.vo.yyx.comment;
import com.accp.hanting.vo.yyx.hysh;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class yyxhybiz {
	                      @Autowired
                          private YyxHyDao dao;
	                      
	                      public PageInfo<hysh> queryAllUser(Integer pageNum,Integer pageSize,String userName,String merchantType){
	                    	        PageHelper.startPage(pageNum, pageSize);
	                    	        return new PageInfo<hysh>(dao.queryAllUser(userName,merchantType));
	                      }
	                      
	                      public hysh queryByUserid(String userID) {
	                    	  return dao.queryByUserid(userID);
	                      }
	                      
	                      public User queryBymj() {
	                    	return dao.queryBymj();  
	                      }
	                      
	                      public PageInfo<comment> queryComment(Integer pageNum,Integer pageSize,String userID,String userName,String serviceTitle){
	                    	  PageHelper.startPage(pageNum, pageSize);
	                    	  return new PageInfo<comment>(dao.queryComment(userID, userName, serviceTitle));
	                      }
	                      
	                      public int CommentDel(List<String>ids) {
	                    	  return dao.CommentDel(ids);
	                      }
	                      
	                      public PageInfo<hysh> querySJ(Integer pageNum,Integer pageSize,String userName,String merchantType,String shopName){
                  	        PageHelper.startPage(pageNum, pageSize);
                  	        return new PageInfo<hysh>(dao.querySJ(userName,shopName,merchantType));
                    }
}
