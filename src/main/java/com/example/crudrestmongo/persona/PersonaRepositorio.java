package com.example.crudrestmongo.persona;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends MongoRepository<Persona, ObjectId> {

}
