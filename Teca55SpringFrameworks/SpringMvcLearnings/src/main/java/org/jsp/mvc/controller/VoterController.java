package org.jsp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VoterController {
	
	@RequestMapping("/display")
	@ResponseBody
	public String display() {
		return "<center><h1>Sania Baganna...!!!</h1></center>";
	}
    
	@RequestMapping("/info")
	public String getInfo() {
		return "info";
	}
}
