package com.opentext;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * Front Controller sends request to the @Controller having @RequestMapping("url")
 */

@Controller
@RequestMapping(path = "/hello")
public class HelloController {

	
	// you can autowire the service layer here
	
	/*
	 * a controller to return model and view -> url should be http://ip:port/app-name/spring/hello/welcome
	 */
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public ModelAndView greet() {
		LocalDateTime time = LocalDateTime.now(); // this is model to show time
		ModelAndView mav = new ModelAndView("hello", "today", time);
		return mav; // front controller looks for hello.jsp, and WEB-INF/pages/hello.jsp must have ${today}
	}
}
