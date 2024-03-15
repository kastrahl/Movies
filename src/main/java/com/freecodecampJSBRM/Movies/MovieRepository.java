package com.freecodecampJSBRM.Movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository             //framework knows this is a repository
public interface MovieRepository extends MongoRepository<movie,Object> {

    // extended the MovieRepository interface with MongoRepository (generics), MongoRepository<what type of data we dealing with (structure) >
    // thus MongoRepository<movie,ObjectID> : movie tells
    // MongoRepository<movie,ObjectID> : ObjectID tells what ID we're dealing with
}
// Overall, this interface declaration indicates that MovieRepository is a repository interface
// responsible for handling MongoDB operations related to movie entities,
// such as saving, updating, deleting, and querying movie documents in a MongoDB collection.
// The specific CRUD methods are provided by the MongoRepository interface, and MovieRepository inherits them.

