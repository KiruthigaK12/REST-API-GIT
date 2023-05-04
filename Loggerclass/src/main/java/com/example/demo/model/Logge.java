package com.example.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Logge 
{
Logger log=LoggerFactory.getLogger(Controller.class);
@RequestMapping("/hi")
public String demo()
{
	log.info("information message");
	log.warn("warning message");
	log.error("Error message");
	log.debug("Debug message");
	log.trace("Trace message");
	return "Completed";
	

}
}
