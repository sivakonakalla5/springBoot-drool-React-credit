package com.siv.drools.controller;




import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.siv.drools.DroolsTest;
import com.siv.drools.model.appli;

@RestController
public class RestMainController {
	
	@Autowired
	private com.siv.drools.DroolsTest droolsTest;
	
	@RequestMapping(value = "/drools", method = RequestMethod.GET)
	public appli getDecision(@RequestParam("value") int value) throws DroolsParserException, IOException {
		return droolsTest.executeDrools(value);
	}
 
}
