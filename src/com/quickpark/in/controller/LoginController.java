package com.quickpark.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
		mv.setViewName("Login1");

		return mv;

	}
	@RequestMapping(value = "/abc", method = RequestMethod.GET)
	public ModelAndView usersession(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();
		

			if(request.getSession().getAttribute("username")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
			{
				mv.setViewName("VehicleOwnerHome");
				
			}
			else if(request.getSession().getAttribute("username")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
			{
				mv.setViewName("PropertOwnerHome");
			
			}
			else if(request.getSession().getAttribute("username")!=null && request.getSession().getAttribute("role").equals("admin"))
			{
				mv.setViewName("AdminHome");
				
			}
		
			else
			{
				mv.setViewName("Login1");
			}

		return mv;

	}
	
	@RequestMapping(value = "/abc", method = RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("userName") String userName, @RequestParam("password") String password,HttpServletRequest request,HttpServletResponse response)
	{	
		ModelAndView modelview = new ModelAndView();
		Login log = new Login();
		log.setUserName(userName);
		log.setPassword(password);

		//System.out.println(UserName+" "+Password);
		Login log1=loginservice.validateUser(log);
		
		
			if(log1!=null)
			{
		if (log1.getUserName() != null) {

			if(log1.getRole().equalsIgnoreCase("vehicleowner"))
			{
				modelview.setViewName("VehicleOwnerHome");
				request.getSession().setAttribute("username", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
			else if(log1.getRole().equalsIgnoreCase("propertyowner"))
			{
				modelview.setViewName("PropertOwnerHome");
				request.getSession().setAttribute("username", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
			else if(log1.getRole().equalsIgnoreCase("admin"))
			{
				modelview.setViewName("AdminHome");
				request.getSession().setAttribute("username", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
		}
		
			}
		else {

			modelview.addObject("msg", "Invalid user id or password.");
			modelview.setViewName("Login1");
		}
		

		return modelview;

	}



@RequestMapping(value = "logout", method = RequestMethod.GET)
public ModelAndView userLogout(HttpServletRequest request,HttpServletResponse response) {

	request.getSession().invalidate();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("Login1");
	return mv;

}


}