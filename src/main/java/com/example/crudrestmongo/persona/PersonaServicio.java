package com.example.crudrestmongo.persona;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    private PersonaRepositorio personaRepositorio;

    @Autowired
    public PersonaServicio(PersonaRepositorio personaRepositorio){
        this.personaRepositorio = personaRepositorio;
    }

    public List<Persona> finAll(){
        return (List<Persona>) personaRepositorio.findAll();
    }

    public Optional<Persona> findPersonaById(ObjectId id){
        return personaRepositorio.findById(id);
    }

    public Persona savePersona(Persona persona){
        return personaRepositorio.save(persona);
    }

    public void eliminarPersona(ObjectId id){
        personaRepositorio.deleteById(id);

    }
}
