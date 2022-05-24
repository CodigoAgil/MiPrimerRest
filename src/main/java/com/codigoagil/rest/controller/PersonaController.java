package com.codigoagil.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigoagil.rest.entity.Persona;
import com.codigoagil.rest.repository.PersonaRepository;

/**
 * La clase PersonaController.
 */
@RestController
@RequestMapping("/")
public class PersonaController {

	/** El repositorio. */
	@Autowired
	private PersonaRepository repositorio;
	
	/**
	 * Busca todas las personas.
	 *
	 * @return the list
	 */
	@GetMapping("/buscar_todas_las_personas")
	public List<Persona> buscaTodasLasPersonas(){
		return repositorio.findAll();
	}
		
	/**
	 * Crea nueva persona.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@PostMapping("/nueva_persona")
	public Persona creaNuevaPersona(@RequestBody Persona persona) {
		return repositorio.save(persona);
	}
	
	/**
	 * Modifica persona.
	 *
	 * @param id the id
	 * @param persona the persona
	 * @return the persona
	 */
	@PutMapping("/modifica_persona/{id}")
	public Persona modificaPersona(@PathVariable int id ,@RequestBody Persona persona) {
		return repositorio.save(persona);
	}
	
	/**
	 * Borra persona.
	 *
	 * @param id the id
	 */
	@DeleteMapping("/borrar_persona/{id}")
	public void borraPersona(@PathVariable("id") Long id) {
		repositorio.deleteById(id);
	}
	
}
