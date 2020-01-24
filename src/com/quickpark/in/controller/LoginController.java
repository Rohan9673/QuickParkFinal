package com.quickpark.in.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.quickpark.in.model.Login;
import com.quickpark.in.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView userLogin() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");

		return mv;

	}

	@RequestMapping(value = "/abc", method = RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("UserName") String UserName, @RequestParam("Password") String Password,HttpSession session) {

		ModelAndView modelview = new ModelAndView();

		Login log = new Login();
		log.setUserName(UserName);
		log.setPassword(Password);

		//System.out.println(UserName+" "+Password);
		Login log1=loginservice.validateUser(log);
		
		
			if(log1!=null)
			{
		if (log1.getUserName() != null) {

			if(log1.getRole().equalsIgnoreCase("vehicleowner"))
			{
				modelview.setViewName("VehicleOwnerHome");
				session.setAttribute("username", UserName);
			}
			else if(log1.getRole().equalsIgnoreCase("propertyowner"))
			{
				modelview.setViewName("PropertOwnerHome");
				session.setAttribute("username", UserName);
			}
			else if(log1.getRole().equalsIgnoreCase("admin"))
			{
				modelview.setViewName("AdminHome");
			session.setAttribute("username", UserName);
			}
		}
		
			}
		else {

			modelview.addObject("msg", "Invalid user id or password.");
			modelview.setViewName("login");
		}
		

		return modelview;

	}



@RequestMapping(value = "logout", method = RequestMethod.GET)
public ModelAndView userLogout() {

	ModelAndView mv = new ModelAndView();
	mv.setViewName("Logout");
	return mv;

}
}