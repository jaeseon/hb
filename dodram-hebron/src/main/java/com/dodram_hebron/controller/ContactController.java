package com.dodram_hebron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dodram_hebron.service.AdminService;
import com.dodram_hebron.vo.ContactBoardVO;

@Controller
public class ContactController {
	
	@Autowired
	private AdminService service;
	
	@RequestMapping(value="/sendQA")
	public void sendQA(@RequestParam String type,
						@RequestParam String name,
						@RequestParam String email,
						@RequestParam String tel,
						@RequestParam String title,
						@RequestParam String contents, HttpServletResponse response) {
		
		ContactBoardVO boardVO = new ContactBoardVO(); 
		
		boardVO.setType(type);
		boardVO.setUser_name(name);
		boardVO.setUser_email(email);
		boardVO.setUser_tel(tel);
		boardVO.setUser_title(title);
		boardVO.setUser_ques(contents);
		
		Map<String, Object> list = new HashMap<>();
		
		list.put("type", type);
		list.put("name", name);
		list.put("email", email);
		list.put("tel", tel);
		list.put("title", title);
		list.put("contents", contents);

		service.insertContactBoard(list);
		
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('문의가 정상적으로 전송되었습니다.')");
			writer.println("window.history.go(-1);");
			writer.println("</script>");
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
