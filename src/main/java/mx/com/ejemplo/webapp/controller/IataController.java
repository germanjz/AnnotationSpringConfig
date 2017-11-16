package mx.com.ejemplo.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mx.com.ejemplo.webapp.beans.ListIataCodes;
import mx.com.ejemplo.webapp.service.IataService;

@Controller
public class IataController {
	@Autowired
	private IataService iataService;
	
	@RequestMapping(value = "codes",
					method = RequestMethod.GET)
	public ModelAndView getUsersView() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("iataModel", iataService.getList());
		return mv;
	}
	
	@RequestMapping(value = "/getList",
					method = RequestMethod.GET,
					headers = "Accept=application/json",
					produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ListIataCodes getList() {
		return iataService.getList();
	}
	
	
}
