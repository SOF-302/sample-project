package vn.poly.sof302.lesson01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Login sample controller
 * 
 * @author duongnguyen
 */
@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * Show login form
	 * 
	 * @return Login form
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		
		return "login/input";
	}

	/**
	 * Show login result
	 * 
	 * @return Welcome page
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String reuslt(ModelMap model, HttpServletRequest request) {
		
		model.addAttribute("username", request.getParameter("username"));
		
		return "login/result";
	}
}
