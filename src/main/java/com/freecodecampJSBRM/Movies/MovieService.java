package com.freecodecampJSBRM.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    //inside this we'll write data access mathods

    @Autowired                                      //it'll let framework know to instantiate the movieRepository
    private MovieRepository movieRepository;        //instantiate interface to variable
    //here we declare an interface and we've to initialise movieRepository
    //either make a constructor or just use @AutoWired
    public List<movie> allMovies(){
        return movieRepository.findAll();           //findAll is defined in mongo repository class
    }
}
