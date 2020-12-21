package com.theansweris42.springbootsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/")
	public String home() {
		log.info("\"/\" page authorized");
		return ("<h1> Welcome</h1>");
	}

	@GetMapping("/user")
	public String user() {
		log.info("\"/user\" authorized");
		return ("<h1>Welcome USER</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		log.info("\"/admin\" auhtorized");
		return ("<h1>Welcome ADMIN</h1>");
	}
}
