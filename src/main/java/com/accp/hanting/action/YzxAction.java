package com.accp.hanting.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.hanting.biz.YzxBiz;
import com.accp.hanting.pojo.Admin;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/yzx")
public class YzxAction {
	@Autowired
	private YzxBiz biz;
	
	@GetMapping("getList")
	public String getList(Integer p, Integer s, Model model) {
		PageInfo<Admin> pageInfo = biz.findPaperByPage(p, s);
		model.addAttribute("PAGE_INFO", pageInfo);
		return "/html/glygl";
	}

}
