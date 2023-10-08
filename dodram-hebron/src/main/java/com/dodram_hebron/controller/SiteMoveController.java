package com.dodram_hebron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*
 * 도드람바이오, 헤브론테크 홈페이지 개발
 * Date: 2018-07-07
 * Author: 이재선
 */

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dodram_hebron.service.AdminService;
import com.dodram_hebron.vo.ContactBoardVO;

@Controller
public class SiteMoveController {
	
	@Autowired
	AdminService service;
	
	/* 
	 * 메인
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		return "index";
	}

	/*
	 * 도드람바이오 접속 로그 수집
	 * Date : 2018-11-25
	 * Author : 엄지용
	 */
	public void companyAccessLog(HttpServletRequest request, HttpServletResponse response, String company){
		Cookie[] cookies = request.getCookies();
		Map<String, Object> cookieValue = new HashMap<String, Object>(); // 쿠키 값을 저장할 Map
		Map<String, Object> access_log = new HashMap<String, Object>();
		if(company.equals("dodram")) // 도드람이면
			access_log.put("companyType", "1");
		else // 헤브론이면
			access_log.put("companyType", "2");
		if(request.getCookies() != null){ // 쿠키가 존재하면 작업 실행 
			for(int i=0; i<cookies.length; i++){ // 쿠키에 있는 값을 모두 map에 저장한다.
				Cookie obj = cookies[i];
				cookieValue.put(obj.getName(), obj.getValue()); // key, value 형식으로 map에 저장
			}
		}
	    if(!cookieValue.containsKey(company)){ // 쿠키에 해당 회사의 정보가 없으면 조회수를 1 증가시켜준다.
	    	Cookie c = new Cookie(company, company);
	    	c.setMaxAge(60*60*24); // 1일
	    	response.addCookie(c);
	    	Date today = new Date();
	    	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	    	access_log.put("date", date.format(today));
	    	if(service.updateCountCompanyAccessLog(access_log) < 1){ // 방문자 수를 늘려준다. 
	    		service.insertCompanyAccessLog(access_log); // 처음 방문 시 방문한 날짜를 입력한다.
	    	}
	    }
	}
	
	/*
	 * 도드람바이오 접속 로그 수집
	 * Date : 2018-11-25
	 * Author : 엄지용
	 */
	@RequestMapping(value = "/dodram")
	public String dodram_home(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/index";
	}
	
	@RequestMapping(value = "/dodram/introduction")
	public String dodram_introduction(Model model, HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		model.addAttribute("content", service.editorBoardList("intro"));
		return "/dodram/introduction/intro";
	}
	@RequestMapping(value = "/dodram/technology")
	public String dodram_technology(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/introduction/technology";
	}
	@RequestMapping(value = "/dodram/organization")
	public String dodram_organization(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/introduction/organization";
	}
	@RequestMapping(value = "/dodram/cooperate")
	public String dodram_cooperate(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/introduction/cooperate";
	}
	@RequestMapping(value = "/dodram/partners")
	public String dodram_partners(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/introduction/partners";
	}
	
	@RequestMapping(value = "/dodram/notice")
	public String dodram_notice(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/notice/index";
	}
	
	@RequestMapping(value = "/dodram/s_product")
	public String dodram_water(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/water";
	}
	@RequestMapping(value = "/dodram/a_product")
	public String dodram_seizeTop(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/seizetop";
	}	
	
	@RequestMapping(value = "/dodram/t_product")
	public String dodram_fertilization(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/fertilization";
	}
	@RequestMapping(value = "/dodram/o_product")
	public String dodram_prog(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/prog";
	}
	@RequestMapping(value = "/dodram/v_product")
	public String dodram_matter(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/matter";
	}
	@RequestMapping(value = "/dodram/i_product")
	public String dodram_gas(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/product/gas";
	}
	
	@RequestMapping(value = "/dodram/visit")
	public String dodram_visit(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/contact/visit";
	}
	@RequestMapping(value = "/dodram/question")
	public String dodram_question(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "dodram");
		return "/dodram/contact/question";
	}

	/*
	 * 헤브론테크
	 */
	@RequestMapping(value = "/hebron")
	public String hebron_home(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/index";
	}
	@RequestMapping(value = "/hebron/introduction")
	public String hebron_introduction(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/introduction/intro";
	}
	@RequestMapping(value = "/hebron/introduction/organization")
	public String hebron_organization(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/introduction/organization";
	}
	
	@RequestMapping(value = "/hebron/f_process")
	public String hebron_metal_process(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/process/metalProcess";
	}
	@RequestMapping(value = "/hebron/s_process")
	public String hebron_product_(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/process/paintingProcess";
	}
	
	
	@RequestMapping(value = "/hebron/v_product")
	public String hebron_production(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/product/production";
	}
	@RequestMapping(value = "/hebron/f_product")
	public String hebron_electric(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/product/electric";
	}
	@RequestMapping(value = "/hebron/s_product")
	public String hebron_electronic(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/product/electronic";
	}
	@RequestMapping(value = "/hebron/t_product")
	public String hebron_oven(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/product/oven";
	}
	@RequestMapping(value = "/hebron/o_product")
	public String hebron_equipment(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/product/equipment";
	}
	@RequestMapping(value = "/hebron/hardware")
	public String hebron_hardware(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/hardware/index";
	}
	
	@RequestMapping(value = "/hebron/visit")
	public String hebron_visit(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/contact/visit";
	}
	@RequestMapping(value = "/hebron/question")
	public String hebron_question(HttpServletRequest request, HttpServletResponse response) {
		companyAccessLog(request, response, "hebron");
		return "/hebron/contact/question";
	}
	
	/*
	 * 관리자 페이지 도드람, 헤브론 금일 접속 인원 표시
	 * Date : 2018-12-09
	 * Author : 엄지용
	 */ 
	@RequestMapping(value = "/myOffice")
	public String admin_index(HttpSession session,
								Model model) throws Exception {
		String adminLogin = (String) session.getAttribute("admin-login");
		
		if (adminLogin == null || adminLogin.equals("")) {
			return "/myOffice/login/index";
		} else {
			model.addAttribute("updateReportList", service.updateReportList());
			try{ 
				HashMap<String, Object> dodram = new HashMap<String,Object>();
				dodram.put("type", "1");
				model.addAttribute("dodramCount", service.selectAccessLogCount(dodram));
			}catch(Exception e){ // 접속한 인원이 없으면 0으로 처리 
				model.addAttribute("dodramCount", "0");
			}
			
			try{
				HashMap<String, Object> hebron = new HashMap<String,Object>();
				hebron.put("type", "2");
				model.addAttribute("hebronCount", service.selectAccessLogCount(hebron));
			}catch(Exception e){ // 접속한 인원이 없으면 0으로 처리 
				model.addAttribute("hebronCount", "0");
			}
			return "/myOffice/index";
		}
	}
	
	@RequestMapping(value = "/myOffice/board/QA")
	public ModelAndView admin_board() {
		List<ContactBoardVO> list =  service.boardList();
				
		ModelAndView mav = new ModelAndView();
		 
		mav.addObject("ContactBoardList", list);
		mav.setViewName("/myOffice/board/QA/index");
		
		return mav;
	}
	
	@RequestMapping(value ="/myOffice/board/QA/delete/{no}")
	public void admin_board_delete(HttpSession session,
									@PathVariable int no, 
									HttpServletResponse response) throws IOException{
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("no", no);
			map.put("userId", session.getAttribute("admin-login"));
			service.deleteContentBoard(map);
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('정상적으로 삭제되었습니다.')");
			writer.println("window.location.href ='/myOffice/board/QA'");
			writer.println("</script>");
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}