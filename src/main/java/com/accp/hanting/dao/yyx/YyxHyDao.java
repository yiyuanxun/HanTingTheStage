package com.accp.hanting.dao.yyx;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.hanting.pojo.User;
import com.accp.hanting.vo.yyx.comment;
import com.accp.hanting.vo.yyx.hysh;



public interface YyxHyDao {
	                               /**
	                                * 显示 条件查询会员审核
	                                * @param userNickName
	                                * @return
	                                */
                                 public List<hysh> queryAllUser(@Param("userName") String userName,@Param("merchantType") String merchantType);
                                 
                                 /**
                                  * 显示修改详情
                                  * @param userID
                                  * @return
                                  */
                                 public hysh queryByUserid(@Param("userID") String userID);
                                 
                                 /**
                                  * 显示总金币和总积分
                                  * @return
                                  */
                                 public User queryBymj();
                                 
                                 /**
                                  * 根据用户id显示对应的评论记录
                                  * @return
                                  */
                                 public List<comment> queryComment(@Param("userID") String userID,@Param("userName") String userName,@Param("serviceTitle") String serviceTitle);
                                 
                                 /**
                                  * 删除指定用户评论(修改显示状态)
                                  * @param serviceAppraiseID
                                  * @return
                                  */
                                 public int CommentDel(@Param("ids") List<String> ids);
                                 
                                 /**
                                  * 商家管理查询显示
                                  * @param userName
                                  * @param shopName
                                  * @param merchantType
                                  * @return
                                  */
                                 public List<hysh> querySJ(@Param("userName") String userName,@Param("shopName") String shopName,@Param("merchantType") String merchantType);
}
