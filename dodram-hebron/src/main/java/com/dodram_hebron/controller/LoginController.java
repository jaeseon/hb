package com.dodram_hebron.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dodram_hebron.service.AdminService;

@Controller
public class LoginController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value ="/loginCheck", method = RequestMethod.POST)
	public void admin_loginCheck(HttpSession session,
								HttpServletResponse response, 
								@RequestParam(value="id") String id,
								@RequestParam(value="password") String pw) throws Exception {
		
		int isAdminLogin = adminService.loginCheckProcess(id, pw);
		
		// 로그인 실패
		if (isAdminLogin == 0 || isAdminLogin == 1) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			
			switch(isAdminLogin) {
				case 0: { 
					writer.println("<script>alert('아이디를 확인해주세요.'); window.history.back();</script>");
					break;
				}
				case 1: {
					writer.println("<script>alert('비밀번호를 확인해주세요.'); window.history.back();</script>");
					break;
				}
			}
			
			writer.flush();
			
		}
		// 로그인 성공
		else {
			session.setAttribute("admin-login", id);
			session.setMaxInactiveInterval(60 * 15); // 15분 세션 유지
			
			response.sendRedirect("myOffice");
		}
	}
	
	@RequestMapping(value ="/admin_logout")
	public String admin_logout(HttpSession session) {
		session.removeAttribute("admin-login");
		
		return "myOffice/index";
	}
}