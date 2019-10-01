package com.collabera.mongodbtest.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.collabera.mongodbtest.model.Jojo;

@Repository
public interface JojoRepo extends MongoRepository<Jojo, Integer>{

}
