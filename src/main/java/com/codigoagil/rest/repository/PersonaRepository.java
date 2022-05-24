package com.codigoagil.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codigoagil.rest.entity.Persona;

/**
 * La Interfaz PersonaRepository.
 */
@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Long>{
	
	/**
	 * Buscar por id.
	 *
	 * @param idPersona la id persona
	 * @return la lista de personas por id
	 */
	List<Persona> findById(long idPersona);

}
