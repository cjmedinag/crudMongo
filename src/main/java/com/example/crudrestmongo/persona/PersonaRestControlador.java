package com.example.crudrestmongo.persona;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonaRestControlador {


    private PersonaServicio personaServicio;

    @Autowired
    public PersonaRestControlador(PersonaServicio personaServicio){
        this.personaServicio = personaServicio;
    }

    @GetMapping
    public List<Persona> findAllPersona(){
        return personaServicio.finAll();
    }

    @GetMapping(value= "/{id}")
    public Optional<Persona> findPersonaById(@PathVariable ObjectId id){
        return personaServicio.findPersonaById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarPersona(@PathVariable("id") ObjectId id){
        personaServicio.eliminarPersona(id);
    }

    @PostMapping
    public Persona savePersona(@RequestBody Persona persona){
        personaServicio.savePersona(persona);
        return persona;
    }

}
