package com.guoyasoft.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("firstWS")
public class FirstWS {

	@RequestMapping("login")
	@ResponseBody
	public Response loin(Request req){
		Response rsp=new Response();
		rsp.setResultCode("0000");
		rsp.setResultDesc("success");
		return rsp;
	}
}
