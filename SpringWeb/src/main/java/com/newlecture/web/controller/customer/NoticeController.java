package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("test", "Hello~");
		return "/WEB-INF/view/customer/notice/list.jsp"; // /customer/notice/list.jsp를 @RequestMapping경로와 중복되기때문에 생략 가능
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "/WEB-INF/view/customer/notice/detail.jsp";
	}
	
}
