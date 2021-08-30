package com.AlbertAbuav.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class LoggerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LoggerApplication.class, args);
		System.out.println("CTOR - Logger in action!");
	}

	@PostMapping("log")
	public void log(@RequestParam int number) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("At: " + new Date() + " got: " + number);
	}


}
