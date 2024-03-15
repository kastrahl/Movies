package com.freecodecampJSBRM.Movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	/* 1st step  configure the database for our application - connect to mongoDB cluster
	* */

//	@GetMapping("/")
//	public String apiRoot(){
//		return " Hello World ";
//	}
}

//we'll divide our service into multiple layers not just one, there will be
//service layer
//dataaccess layer
//API layer
//