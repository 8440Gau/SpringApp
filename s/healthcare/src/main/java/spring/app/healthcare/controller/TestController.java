package spring.app.healthcare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="patientDetails")
public class TestController {

	@RequestMapping(value="test", method = RequestMethod.GET)
	public String Test() {
		return "Done";
	}
}
