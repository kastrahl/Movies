package com.freecodecampJSBRM.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//check use of below annotations from movie.java
@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
    @Id
    private ObjectId reviewId;
    private String reviewBody;
}
