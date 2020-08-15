package com.controller;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	@RequestMapping("demo1")
	public String demo1(HttpServletRequest req, HttpSession sessionParam) {
		// request作用域
		req.setAttribute("req", "req的值");
		// session作用域
		HttpSession session = req.getSession();
		session.setAttribute("reqSession", "reqSession的值");
		sessionParam.setAttribute("sessionParam", "sessionParam的值");
		// application作用域
		ServletContext application = req.getServletContext();
		application.setAttribute("application", "application的值");
		return "/show.jsp";

	}

	@RequestMapping("demo2")
	public String demo2(HttpSession session,HttpServletRequest req) {
		System.out.println(req.getAttribute("req"));
		System.out.println(session.getAttribute("reqSession"));
		System.out.println(req.getSession().getAttribute("reqSession"));
		System.out.println(req.getServletContext().getAttribute("application"));
		return "/show.jsp";
	}
	@RequestMapping("demo6")
	public String demo6(HttpSession session,HttpServletRequest req) {
		System.out.println(req.getAttribute("req"));
		System.out.println(session.getAttribute("reqSession"));
		System.out.println(req.getSession().getAttribute("reqSession"));
		System.out.println(req.getServletContext().getAttribute("application"));
		return "/show.jsp";
	}

	@RequestMapping("demo3")
	public String demo3(Map<String, Object> map) {
		System.out.println(map.getClass());
		map.put("mapkey", "map的值");
		return "/show.jsp";
	}

	@RequestMapping("demo4")
	public String demo4(Model model) {
		model.addAttribute("modelkey", "model的值");
		return "/show.jsp";
	}

	@RequestMapping("demo5")
	public ModelAndView demo5() {
		ModelAndView mav = new ModelAndView("/show.jsp");
		mav.addObject("mavkey", "mav的值");
		return mav;
	}
}
