package com.freecodecampJSBRM.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//first actual controller of three layer structure
//commented code in MoviesApplication.java is simple controller for the application

@RestController                     //annotate as rest controller class
                                    //instead of mapping this class to localhost:8080 we map it to below url
@RequestMapping("/api/v1/movies")   //all requests to this particular port will be handled by the below controller
public class MovieController {

    @Autowired
    private MovieService movieService;          //need reference to our service class
    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies(){              //we return a responseentity of type list movies
        return new ResponseEntity<List<movie>>(movieService.allMovies(), HttpStatus.OK);
    }
//    @GetMapping         //Get mapping method
//    public ResponseEntity<String> getAllMovies(){
//        return new ResponseEntity<String>("All Movies", HttpStatus.OK);
//    }

// Httpsstatus.ok means 200 || this comes in handy
//  when working on front end application and any RESTAPI should return proper status codes,

//    public String allMovies(){
//        return "All Movies!";
//    }
}

