package com.freecodecampJSBRM.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")        //let's framework know that this is object for each movie in the collection
@Data                                   //this comes from lombok project where we don't need to make getters,setters and toStrings for each
@AllArgsConstructor    //this takes care of making all the constructors for each private field
@NoArgsConstructor      //this constructor doesn't take any argument
public class movie {

    @Id                 //property should be treated as unique identifier for each movie
    private ObjectId id;
    private String imdbid;
    private String title;
    private String releaseDate;
    private String trailer;
    private String posterlink;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference                  //this will cause DB to store only IDs of reviews, reviewbody will be in seperate collection
    private List<Reviews> reviewids;    //this is embedded relationship, all reviews to this movie will be added to the list, Useful for one2many relationship
    //we need to make getters, setters and toString methods for these

}
