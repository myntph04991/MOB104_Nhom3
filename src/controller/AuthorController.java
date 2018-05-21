package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.clientDAO;

@Controller
public class AuthorController {
	@Autowired
	clientDAO cliDAO;

	@RequestMapping("/signin")
	public String signin() {
		return "author/signin";
	}

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/signup")
	public String sigup() {
		return "author/signup";
	}

	@RequestMapping("/login")
	public String login(ModelMap md, HttpSession session, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (cliDAO.checkLogin(username, password)) {
			session.setAttribute("user", username);
			return "redirect:/home/manage.htm";
		} else {
			md.addAttribute("mss", "Đăng nhập thất bại!");
			return "author/signin";
		}

	}

	@RequestMapping("/register")
	public String register(ModelMap md,HttpSession session, @RequestParam("username") String username,@RequestParam("password") String password,
			@RequestParam("repassword") String repassword,@RequestParam("email") String email) {
		boolean kq = cliDAO.insertCli(username, password, email);
		if(kq ==true) {
			return "author/success";
		}else {
			return "author/signup";
		}
	
	}

}
