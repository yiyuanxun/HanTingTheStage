package com.accp.hanting.action.yyx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.hanting.biz.yyx.yyxhybiz;
import com.accp.hanting.pojo.User;
import com.accp.hanting.vo.yyx.comment;
import com.accp.hanting.vo.yyx.hysh;
import com.github.pagehelper.PageInfo;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/api/yyx")
public class YyxHyAction {
	                   @Autowired
                       private yyxhybiz biz;
	                   
	                @GetMapping("getList")
	               	public String getList(Integer p, Integer s,String userName, Model model) {
	                   	if(userName==null||userName=="") {
	                   		userName=null;
	               		}
	               		PageInfo<hysh> pageInfo = biz.queryAllUser(p, s, userName,"0");
	               		model.addAttribute("userName", userName);
	               		model.addAttribute("PAGE_INFO1", pageInfo);
	               		model.addAttribute("mj", biz.queryBymj());
	               		return "yyx/Member-audit";
	               	}
	                
	                @GetMapping("queryByUserid")
	               	public String queryByUserid(String id, Model model) {
	                	model.addAttribute("User1", biz.queryByUserid(id));
	               		return "yyx/Menber-xg";
	               	}
	                
	                @GetMapping("getComment")
	               	public String getcomment(Integer p, Integer s,String userID,String userName,String serviceTitle, Model model) {
	                	if(userID==""||userID==null) {
	                		userID=null;
	               		}
	                	if(userName==""||userName==null) {
	                		userName=null;
	               		}
	               		if(serviceTitle==""||serviceTitle==null) {
	               			serviceTitle=null;
	               		}
	               		PageInfo<comment> pageInfo =biz.queryComment(p, s, userID, userName, serviceTitle);
	               		model.addAttribute("userID", userID);
	               		model.addAttribute("userName", userName);
	               		model.addAttribute("serviceTitle", serviceTitle);
	               		model.addAttribute("PAGE_INFO1", pageInfo);
	               		return "yyx/Comment-management";
	               	}
	                          
	                @GetMapping("getEomment")
	               	public String getEcomment(Integer p, Integer s,String userID,String userName,String serviceTitle, Model model) {
	                	if(userID==""||userID==null) {
	                		userID=null;
	               		}
	                	if(userName==""||userName==null) {
	                		userName=null;
	               		}
	               		if(serviceTitle==""||serviceTitle==null) {
	               			serviceTitle=null;
	               		}
	               		PageInfo<comment> pageInfo =biz.queryComment(p, s, userID, userName, serviceTitle);
	               		model.addAttribute("userID", userID);
	               		model.addAttribute("userName", userName);
	               		model.addAttribute("serviceTitle", serviceTitle);
	               		model.addAttribute("PAGE_INFO1", pageInfo);
	               		return "yyx/Evaluation-management";
	               	}
	                
	                @PostMapping("commentDel")
	               	public String CommentDel( String [] ids, String userID,String userName,String serviceTitle) {
	                	List<String> s=new ArrayList<String>();
	                	for (String id : ids) {
							s.add(id);
						}
      				int a= biz.CommentDel(s);     
      				if(userID==null||userID=="") {
      					userID=null;
      				}
	               		return "redirect:getComment?p=1&s=20&userID="+userID+"&userName="+userName+"&serviceTitle="+serviceTitle+"";
	               	}
	                
	                @GetMapping("getSJ")
	               	public String getSJ(Integer p, Integer s,String userName,String shopName,String merchanttype, Model model) {
	                   	if(userName==null||userName=="") {
	                   		userName=null;
	               		}
	                   	if(shopName==null||shopName=="") {
	                   		shopName=null;
	               		}
	                   	System.out.println(p);
	                   	System.out.println(s);
	                   	System.out.println(userName);
	                   	System.out.println(shopName);
	                   	System.out.println(merchanttype);
	               		PageInfo<hysh> pageInfo = biz.querySJ(p, s, userName, merchanttype, shopName);
	               		model.addAttribute("userName", userName);
	               		model.addAttribute("merchanttype", merchanttype);
	               		model.addAttribute("shopName", shopName);
	               		model.addAttribute("PAGE_INFO1", pageInfo);
	               		model.addAttribute("mj", biz.queryBymj());
	               		return "yyx/Merchant-management";
	               	}
}
