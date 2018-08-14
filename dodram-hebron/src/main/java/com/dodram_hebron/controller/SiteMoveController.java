package com.dodram_hebron.controller;

import java.util.List;

/*
 * 도드람바이오, 헤브론테크 홈페이지 개발
 * Date: 2018-07-07
 * Author: 이재선
 */

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	 * 도드람바이오
	 */
	@RequestMapping(value = "/dodram")
	public String dodram_home() {
		return "/dodram/index";
	}
	
	@RequestMapping(value = "/dodram/introduction")
	public String dodram_introduction() {
		return "/dodram/introduction/intro";
	}
	@RequestMapping(value = "/dodram/technology")
	public String dodram_technology() {
		return "/dodram/introduction/technology";
	}
	@RequestMapping(value = "/dodram/organization")
	public String dodram_organization() {
		return "/dodram/introduction/organization";
	}
	@RequestMapping(value = "/dodram/cooperate")
	public String dodram_cooperate() {
		return "/dodram/introduction/cooperate";
	}
	@RequestMapping(value = "/dodram/partners")
	public String dodram_partners() {
		return "/dodram/introduction/partners";
	}
	
	@RequestMapping(value = "/dodram/notice")
	public String dodram_notice() {
		return "/dodram/notice/index";
	}
	
	@RequestMapping(value = "/dodram/s_product")
	public String dodram_water() {
		return "/dodram/product/water";
	}
	@RequestMapping(value = "/dodram/t_product")
	public String dodram_fertilization() {
		return "/dodram/product/fertilization";
	}
	@RequestMapping(value = "/dodram/o_product")
	public String dodram_prog() {
		return "/dodram/product/prog";
	}
	@RequestMapping(value = "/dodram/v_product")
	public String dodram_matter() {
		return "/dodram/product/matter";
	}
	@RequestMapping(value = "/dodram/i_product")
	public String dodram_gas() {
		return "/dodram/product/gas";
	}
	
	@RequestMapping(value = "/dodram/visit")
	public String dodram_visit() {
		return "/dodram/contact/visit";
	}
	@RequestMapping(value = "/dodram/question")
	public String dodram_question() {
		return "/dodram/contact/question";
	}
	

	/*
	 * 헤브론테크
	 */
	@RequestMapping(value = "/hebron")
	public String hebron_home() {
		return "/hebron/index";
	}
	@RequestMapping(value = "/hebron/introduction")
	public String hebron_introduction() {
		return "/hebron/introduction/intro";
	}
	@RequestMapping(value = "/hebron/introduction/organization")
	public String hebron_organization() {
		return "/hebron/introduction/organization";
	}
	
	
	@RequestMapping(value = "/hebron/f_process")
	public String hebron_metal_process() {
		return "/hebron/process/metalProcess";
	}
	@RequestMapping(value = "/hebron/s_process")
	public String hebron_product_() {
		return "/hebron/process/paintingProcess";
	}
	
	
	@RequestMapping(value = "/hebron/v_product")
	public String hebron_production() {
		return "/hebron/product/production";
	}
	@RequestMapping(value = "/hebron/f_product")
	public String hebron_electric() {
		return "/hebron/product/electric";
	}
	@RequestMapping(value = "/hebron/s_product")
	public String hebron_electronic() {
		return "/hebron/product/electronic";
	}
	@RequestMapping(value = "/hebron/t_product")
	public String hebron_oven() {
		return "/hebron/product/oven";
	}
	@RequestMapping(value = "/hebron/o_product")
	public String hebron_equipment() {
		return "/hebron/product/equipment";
	}
	
	@RequestMapping(value = "/hebron/hardware")
	public String hebron_hardware() {
		return "/hebron/hardware/index";
	}
	
	@RequestMapping(value = "/hebron/visit")
	public String hebron_visit() {
		return "/hebron/contact/visit";
	}
	@RequestMapping(value = "/hebron/question")
	public String hebron_question() {
		return "/hebron/contact/question";
	}
	
	/*
	 * 관리자 페이지 
	 */ 
	@RequestMapping(value = "/myOffice")
	public String admin_index(HttpSession session) {
		String adminLogin = (String) session.getAttribute("admin-login");
		
		if (adminLogin == null || adminLogin.equals("")) {
			return "/myOffice/login/index";
		} else {
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
	
}